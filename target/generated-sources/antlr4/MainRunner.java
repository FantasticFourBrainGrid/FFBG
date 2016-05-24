import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MainRunner 
{
    public static void main( String[] args) throws Exception 
    {
    	System.out.print("Enter in your .m file name: ");
    	String fileName = System.console().readLine();
    	
        ANTLRInputStream input = new ANTLRFileStream(fileName);

        MATLABLexer lexer = new MATLABLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        MATLABParser parser = new MATLABParser(tokens);
        ParseTree tree = parser.file(); 
        
        XMLBuilder xmlBuilder = new XMLBuilder();
        String output = xmlBuilder.visit(tree);
        
        FileWriter fw;
        try{
        	fw = new FileWriter(new File("G5TestOutput.xml"));
        	
        	fw.write(output);
        	fw.close();
        }
        catch (IOException ex){
        	ex.printStackTrace();
        }
    }
}