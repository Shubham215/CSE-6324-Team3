package source_unit;

import org.antlr.v4.runtime.Token;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.EventDefinitionContext;


public class AntlrToEventDef extends ExprBaseVisitor<Contract_Components>{
public String event_Def_Warning;
	
	public AntlrToEventDef(String event_Def_Warning) {
		this.event_Def_Warning = event_Def_Warning;
	}
	@Override
	public Contract_Components visitEventDefinition(EventDefinitionContext ctx) {
		String event_Def = ctx.getChild(1).getChild(0).getText();
		if(!Character.isLetter(event_Def.charAt(0)))
			return new Function_Def(event_Def);
		//System.out.println(func_Def);
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		if(Character.toUpperCase(event_Def.charAt(0))!=event_Def.charAt(0)) {
			System.out.println("[Developmental issue] Style Guide Violation at line:"+line+ ". An event should always begin with an Upper_Case.");
		}
		else {
			int j=1;
			while(j<event_Def.length()) {
				if(event_Def.charAt(j)=='_') {
					if(!(Character.toUpperCase(event_Def.charAt(j+1))==event_Def.charAt(j+1)))
						System.out.println("[Developmental issue] Style Guide Violation at line:"+line+ ". Please use Camel Case for event definition.");
				}
				j++;
			}
		}
		
		return new Event_Def(event_Def);
	}

}
