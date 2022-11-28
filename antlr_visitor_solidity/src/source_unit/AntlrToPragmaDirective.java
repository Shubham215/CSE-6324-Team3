package source_unit;

import java.util.*;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.PragmaDirectiveContext;

public class AntlrToPragmaDirective extends ExprBaseVisitor<Pragma_Directive> {
	
	public String VersionError; //Accessed by main app prog.

	@Override
	public Pragma_Directive visitPragmaDirective(PragmaDirectiveContext ctx) {
		Pragma_Directive pragD = new Pragma_Directive();
		VersionError = "";
		AntlrToAttribute attributevisitor = new AntlrToAttribute(VersionError);
		pragD.addAttribute(attributevisitor.visit(ctx.getChild(2).getChild(0).getChild(0)));
		VersionError = attributevisitor.VersionError;
		//System.out.println(VersionError);
		// TODO Auto-generated method stub
		return pragD;
	}
	
	
	

}
