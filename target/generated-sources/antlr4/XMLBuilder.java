import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class XMLBuilder implements ParseTreeVisitor{
	
	@Override
	public String visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		String content = arg0.getText();
		return content;
	}
	@Override
	public Object visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
