package source_unit;

import org.antlr.v4.runtime.Token;

import java.util.*;
import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.CheckModifierContext;

public class AntlrToA_Modifier extends ExprBaseVisitor<A_Modifier> 
{
	public String mod = "";
	public AntlrToA_Modifier(String mod)
	{
		this.mod = mod;
	}
	
	
	@Override
	public A_Modifier visitCheckModifier(CheckModifierContext ctx)
	{
		String modif="";
//		System.out.println(modif);
		//getting the first character of.		
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		if(ctx.getChildCount()<1)
			System.out.println("[Developmental issue] Please specify the modifier at line ["+line+"].");
			
		else if(ctx.getChildCount()>1) 
		{
			
				String M = ctx.getChild(0).toString();
			    //System.out.println("No error since the modifier is specified as:"+M + " at line ["+line +"]");
			    modif = M;
			
		}
		else if(ctx.getChildCount()==1 && (ctx.getChild(0).getText().equalsIgnoreCase("external")) || (ctx.getChild(0).getText().equalsIgnoreCase("public")) ||(ctx.getChild(0).getText().equalsIgnoreCase("private")) || (ctx.getChild(0).getText().equalsIgnoreCase("internal"))) {
			String M = ctx.getChild(0).toString();
		    //System.out.println("No error since the modifier is specified as:"+M + " at line ["+line +"]");
		    modif = M;
		}
		else
		{
			System.out.println("[Developmental issue] Please specify the modifier at line ["+line+"].");
		}
			
		return new Modifier(modif);
	}
}
