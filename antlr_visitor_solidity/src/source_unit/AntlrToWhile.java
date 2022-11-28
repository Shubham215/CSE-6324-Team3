package source_unit;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.ExpressionContext;
import antlr.ExprParser.ForStatementContext;
import antlr.ExprParser.IfStatementContext;
import antlr.ExprParser.WhileStatementContext;


public class AntlrToWhile extends ExprBaseVisitor<Contract_Components>{
public String DOS_Warning;
	
	public AntlrToWhile(String DOS_Warning) {
		this.DOS_Warning = DOS_Warning;
	}
	@Override
	public Contract_Components visitWhileStatement(WhileStatementContext ctx) {
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		String curr =  ctx.getChild(2).getText();
		//System.out.println(ctx.getChild(2).getText());
		for(int i=0;i<curr.length();i++) {
			char ch = curr.charAt(i);
			if(ch=='.') {
				++i;
				while(i<curr.length()) {
					if(curr.charAt(i)=='(')
						System.out.println("Security issue at line "+line+": Possibility of a DOS attack due to an external call inside for condition.");
					i++;
				}
			}
			
		}
		
		
		//System.out.println(expressionTacker(ctx1));
		
		
		
		return new Event_Def("");
	}
	

}
