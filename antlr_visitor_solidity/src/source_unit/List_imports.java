package source_unit;

import java.util.ArrayList;
import java.util.List;

public class List_imports {
public List<Imports> attributes;
	
	public List_imports() {
		this.attributes= new ArrayList<>();
	}
	
	public void addImports(Imports a) 
	{
		attributes.add(a);
	}


}
