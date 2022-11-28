package source_unit;
import org.antlr.v4.runtime.Token;
import java.util.*;
import antlr.ExprBaseVisitor;

import antlr.ExprParser.StateVariableDeclarationContext;
import antlr.ExprParser.VariableDeclarationListContext;

public class AntlrtoStateVariable  extends ExprBaseVisitor<Contract_Components>{
public String state_Variable_Warning;
	
	public AntlrtoStateVariable(String state_Variable_Warning) {
		this.state_Variable_Warning = state_Variable_Warning;
	}
	
	@Override
	public Contract_Components visitStateVariableDeclaration(StateVariableDeclarationContext ctx) {
		String decVariable = ctx.getText();
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		String modifier = ctx.getChild(1).getText();
		if(modifier.equalsIgnoreCase("private")) {
			System.out.println("[Developmental issue] The private modifier does not hide the\r\n" + 
					"variable’s value, only prevents external contracts\r\n" + 
					"from editing it at line [" +line+ "]");
		}
		return new State_Variable_Def(decVariable);
	}
	
	

}
