package source_unit;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.ExpressionContext;
import antlr.ExprParser.IfStatementContext;


public class AntlrToIfCond extends ExprBaseVisitor<Contract_Components>{
public String DOS_Warning;
	
	public AntlrToIfCond(String DOS_Warning) {
		this.DOS_Warning = DOS_Warning;
	}
	@Override
	public Contract_Components visitIfStatement(IfStatementContext ctx) {
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		String curr =  ctx.getChild(2).getText();
//		System.out.println(ctx.getChild(2).getText());
		for(int i=0;i<curr.length();i++) {
			char ch = curr.charAt(i);
			if(ch=='.') {
				++i;
				while(i<curr.length()) {
					if(curr.charAt(i)=='(')
						System.out.println("Security issue at line "+line+": Possibility of a DOS attack due to an external call inside if condition.");
					i++;
				}
			}
			
		}
		
		
		//System.out.println(expressionTacker(ctx1));
		
		
		
		return new Event_Def("");
	}
//	public static boolean expressionTacker(ParseTree parsetree) {
//		int k = parsetree.getChildCount();
//		boolean result = false;
//		for(int i=0;i<k;i++) {
//			String curr = parsetree.getChild(i).getText();
//			System.out.println(curr);
//			if(curr.equalsIgnoreCase("functionCallArguments")) {
//				if(parsetree.getChild(0).getChild(1).getText().equalsIgnoreCase("."))
//					result = true;
//			}
//			else if(curr.equalsIgnoreCase("expression")) {
//				ParseTree newparse = parsetree.getChild(i);
//				//result = expressionTacker(newparse);
//			}
//			
//		}
//		return result;
//	}

}
