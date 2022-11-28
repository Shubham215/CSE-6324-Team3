package source_unit;

import java.util.ArrayList;
import java.util.List;



public class List_Amodifier {
	public List<A_Modifier> attributes;
	
	public List_Amodifier() {
		this.attributes= new ArrayList<>();
	}
	
	public void addModifier(A_Modifier a) 
	{
		attributes.add(a);
	}

}