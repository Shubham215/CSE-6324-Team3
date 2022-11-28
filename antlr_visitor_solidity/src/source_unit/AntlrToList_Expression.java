package source_unit;

import antlr.ExprBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import antlr.ExprParser.ExprCheckContext;
import antlr.ExprParser.ExpressionListContext;

public class AntlrToList_Expression extends ExprBaseVisitor<List_AExpr> 
{
	public String modif;
	@Override
	public List_AExpr visitExpressionList(ExpressionListContext ctx) 
	{
		//A_Modifier
		List_AExpr modD = new List_AExpr();
		modif = "";
		//System.out.println(ctx.getChild(3).getChild(0).getText());
		AntlrToA_Expr attributevisitor = new AntlrToA_Expr(modif);
		//A_Modifier p = attributevisitor.visit(ctx.getChild(3).getChild(0));
		modD.addExpr(attributevisitor.visit(ctx));
		modif = attributevisitor.exp;
		//System.out.println(VersionError);
		// TODO Auto-generated method stub
		return modD;
	}
}
