package source_unit;
import org.antlr.v4.runtime.tree.ParseTree;
import antlr.ExprBaseVisitor;
import antlr.ExprParser.CheckModifierContext;
import antlr.ExprParser.FunctionDefinitionContext;
public class AntlrToList_Amodifier extends ExprBaseVisitor<List_Amodifier> 
{
	public String modif; //Accessed by main app prog.

	@Override
	public List_Amodifier visitFunctionDefinition(FunctionDefinitionContext ctx) 
	{
		//A_Modifier
		List_Amodifier modD = new List_Amodifier();
		modif = "";
		//System.out.println(ctx.getChild(3).getChild(0).getText());
		AntlrToA_Modifier attributevisitor = new AntlrToA_Modifier(modif);
		//A_Modifier p = attributevisitor.visit(ctx.getChild(3).getChild(0));
		modD.addModifier(attributevisitor.visit(ctx.getChild(3)));
		modif = attributevisitor.mod;
		//System.out.println(VersionError);
		// TODO Auto-generated method stub
		return modD;
	}
	

}
