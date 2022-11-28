package source_unit;

import org.antlr.v4.runtime.Token;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.FunctionDefinitionContext;
import antlr.ExprParser.StateVariableDeclarationContext;

public class AntlrToFuncDef extends ExprBaseVisitor<Contract_Components>{
	public String func_Def_Warning;
	
	public AntlrToFuncDef(String func_Def_Warning) {
		this.func_Def_Warning = func_Def_Warning;
	}
	
	@Override
	public Contract_Components visitFunctionDefinition(FunctionDefinitionContext ctx) {
		String func_Def = ctx.getChild(1).getChild(0).getText();
		if(!Character.isLetter(func_Def.charAt(0)))
			return new Function_Def(func_Def);
		//System.out.println(func_Def);
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		if(Character.toUpperCase(func_Def.charAt(0))==func_Def.charAt(0)) {
			System.out.println("[Developmental issue] Style Guide Violation at line:"+line+ ". A function should always begin with a Lower_Case.");
		}
		else {
			int j=1;
			while(j<func_Def.length()) {
				if(func_Def.charAt(j)=='_') {
					if(!(Character.toUpperCase(func_Def.charAt(j+1))==func_Def.charAt(j+1)))
						System.out.println("[Developmental issue] Style Guide Violation at line:"+line+ ". Please use Camel Case for function definition.");
				}
				j++;
			}
		}
		
		return new Function_Def(func_Def);
	}

}
