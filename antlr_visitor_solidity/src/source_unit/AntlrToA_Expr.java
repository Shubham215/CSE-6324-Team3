package source_unit;
import org.antlr.v4.runtime.Token;
import java.util.*;
import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.ExprCheckContext;
public class AntlrToA_Expr extends ExprBaseVisitor<A_Expr> 
{
	public String exp = "";
	public AntlrToA_Expr(String exp)
	{
		this.exp = exp;
	}
	
	@Override
	public A_Expr visitExprCheck(ExprCheckContext ctx)
	{
		//System.out.println(ctx.getChild(0).toString() + " " + ctx.getChild(1).toString()+ " "+ctx.getChild(2).toString());
		//System.out.println(ctx.getChild(0).getText());
		String modif="";	
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		if(ctx.getChildCount()>=3 && ctx.getChild(1).getText().equalsIgnoreCase(".") && ctx.getChild(2).getText().equalsIgnoreCase("send") || (ctx.getChildCount()>=3 && ctx.getChild(1).getText().equalsIgnoreCase(".") && ctx.getChild(2).getText().equalsIgnoreCase("transfer")))
		{
			String M = ctx.getChild(2).toString();
			modif = M;
			System.out.println("[Security issue] Use recommended call function at line ["+line+"].");
		}
		return new Expr(modif);
	}
}
