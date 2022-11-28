package source_unit;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.FunctionDefinitionContext;
import antlr.ExprParser.ImportDeclarationContext;

public class AntlrToList_Import extends ExprBaseVisitor<List_imports>
{
	public String modif; //Accessed by main app prog.'
	
	@Override
	public List_imports visitImportDeclaration(ImportDeclarationContext ctx) 
	{
		//A_Modifier
		List_imports modD = new List_imports();
		modif = "";
		//System.out.println(ctx.getChild(3).getChild(0).getText());
		AntlrTo_Imports attributevisitor = new AntlrTo_Imports(modif);
		//A_Modifier p = attributevisitor.visit(ctx.getChild(3).getChild(0));
		modD.addImports(attributevisitor.visit(ctx));
		modif = attributevisitor.imp;
		//System.out.println(VersionError);
		// TODO Auto-generated method stub
		return modD;
	}
}
