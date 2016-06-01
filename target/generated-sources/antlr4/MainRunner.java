import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MainRunner 
{
	private static String result;
    public static void main( String[] args) throws Exception 
    {
    	result = "";
    	System.out.print("Enter in your .m file name: ");
    	String fileName = System.console().readLine();
//    	String fileName = System.getProperty("user.dir") + "/scripts/G5Test1.m";
        ANTLRInputStream input = new ANTLRFileStream(fileName);

        MATLABLexer lexer = new MATLABLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MATLABParser parser = new MATLABParser(tokens);
        ParseTree tree = parser.file(); 
        traverse(tree);
        XMLBuilder xmlBuilder = new XMLBuilder(result);
        String output = xmlBuilder.generate();
        
        FileWriter fw;
        try{
        	fw = new FileWriter(new File("G6TestOutput.xml"));
        	
        	fw.write(output);
        	fw.close();
        }
        catch (IOException ex){
        	ex.printStackTrace();
        }
        
        
    }
    private static void traverse(ParseTree pt)
    {
    	traverseHelper(pt, pt.getChildCount());
    }
    
    private static void traverseHelper(ParseTree node, int extCounter)
    {
    	// base case: counter reaches parameter passed in or is entity reference
    	String grammarType = node.getPayload().getClass().toString();
    	
    	// leaf node (data)
    	if (grammarType.equals("class org.antlr.v4.runtime.CommonToken"))
    	{
    		result += node.getText() + "\n";
    		return;
    	}
    	
    	// grammar node (can include PROV object types)
    	result += grammarType.substring(grammarType.indexOf("$") + 1, grammarType.indexOf("Context")) + "\n";
    	
    	// travel to all i children of this node
    	for (int i = 0; i < extCounter; i++)
    	{
    		traverseHelper(node.getChild(i), node.getChild(i).getChildCount());
    	}
    	
    }

}
