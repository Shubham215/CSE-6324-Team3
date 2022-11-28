package source_unit;

import org.antlr.v4.runtime.Token;

import antlr.ExprBaseVisitor;
import antlr.ExprParser;
import antlr.ExprParser.ImportDeclarationContext;
import antlr.ExprParser.ImportDirectiveContext;

public class AntlrTo_Imports extends ExprBaseVisitor<Imports> 
{
	public String imp = "";
	public AntlrTo_Imports(String imp)
	{
		this.imp = imp;
	}

	@Override
	public Imports visitImportDirective(ImportDirectiveContext ctx)
	{
		Token sttoken = ctx.getStart();
		int line = sttoken.getLine();
		if(!ctx.isEmpty())
		{
			String m = ctx.getText();
			imp = m;
			//System.out.println(ctx.getChild(1).getText());
			System.out.println("[Developmental issue] Please audit the library imported at line ["+line+"].");
		}
		return new ImportImpl(imp);
		
	}
}
