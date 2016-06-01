import java.util.Vector;

public class XMLBuilder{
	private String result;
	private Vector<String> entityArray;
	private Vector<String> activityArray;
	public XMLBuilder(String result)
	{
		this.result = result;
		entityArray = new Vector<String>();
		activityArray = new Vector<String>();
	}
	
	public String generate()
	{
		String[] currentLine;
		String[] currentStatement;
		String output = "<prov:document>\n";
		result = result.substring(result.indexOf("Statement"));
		currentStatement = result.split("\n;\n");
		
		// DEBUG: change end index
		// loops through each statement
		for (int i = 0; i < 2; i++)
		{
			currentLine = currentStatement[i].split("\n");
			String left = currentLine[3];
			
			if (currentLine[1].equals("WasDerivedFrom"))
			{
				// looks at left hand side of assignment
				// append entity to array if it has not been declared yet,
				// then add entity XML element
				if (!entityArray.contains(left))
				{
					output += "\t<prov:entity prov:id=\"" + left + "\"/>\n";
					entityArray.add(left);
				}
				
				// looks at right hand side of assignment
				for (int s = 6; s < currentLine.length; s++)
				{
					if (currentLine[s].equals("Entity_reference"))
					{
						s++;
						String curEntity = currentLine[s];
						// looks at the next line, checks if the entity/variable is the same as left hand side
						// if it isn't, declare it and create a wasDerivedFrom element
						if (!left.equals(curEntity))
						{
							if (!entityArray.contains(currentLine[s]))
							{
								output += "\t<prov:entity prov:id=\"" + curEntity + "\"/>\n";
								entityArray.add(curEntity);
							}
							output += "\t<prov:wasDerivedFrom>\n";
							output += "\t\t<prov:generatedEntity prov:ref=\"" + left + "\"/>\n";
							output += "\t\t<prov:usedEntity prov:ref=\"" + curEntity + "\"/>\n";
							output += "\t</prov:wasDerivedFrom>\n";
						}
					}
				}
			}
			else if (currentLine[1].equals("WasGeneratedBy"))
			{
				// looks at left hand side of assignment
				// append entity to array if it has not been declared yet,
				// then add entity XML element
				if (!entityArray.contains(left))
				{
					output += "\t<prov:entity prov:id=\"" + left + "\"/>\n";
					entityArray.add(left);
				}
				
				// looks at right hand side of assignment
				for (int s = 5; s < currentLine.length; s++)
				{
					if (currentLine[s].equals("Activity_reference"))
					{
						s++;
						String curActivity = currentLine[s];
						// looks at next line, gets the activity name
						if (!activityArray.contains(curActivity))
						{
							output += "\t<prov:activity prov:id=\"" + curActivity + "\"/>\n";
							activityArray.add(curActivity);
						}
						output += "\t<prov:wasGeneratedBy>\n";
						output += "\t\t<prov:entity prov:ref=\"" + left + "\"/>\n";
						output += "\t\t<prov:activity prov:ref=\"" + curActivity + "\"/>\n";
						output += "\t</prov:wasGeneratedBy>\n";
						
						// look for any entities used. skips all nested activities.
						for (; s < currentLine.length; s++)
						{
							if (currentLine[s].equals("Entity_reference"))
							{
								s++;
								if (!entityArray.contains(currentLine[s]))
								{
									output += "\t<prov:entity prov:id=\"" + currentLine[s] + "\"/>\n";
									entityArray.add(currentLine[s]);
								}
								output += "\t<prov:used>\n";
								output += "\t\t<prov:entity prov:ref=\"" + currentLine[s] + "\"/>\n";
								output += "\t\t<prov:activity prov:ref=\"" + curActivity + "\"/>\n";
								output += "\t</prov:used>\n";
							}
						}
					}
				}
			}
		}
		output += "</prov:document>";
		return output;
	}
}
