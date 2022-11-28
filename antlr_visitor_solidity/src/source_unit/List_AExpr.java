package source_unit;

import java.util.ArrayList;
import java.util.List;

public class List_AExpr 
{
	public List<A_Expr> attributes;
	
	public List_AExpr() {
		this.attributes= new ArrayList<>();
	}
	
	public void addExpr(A_Expr a) 
	{
		attributes.add(a);
	}

}
