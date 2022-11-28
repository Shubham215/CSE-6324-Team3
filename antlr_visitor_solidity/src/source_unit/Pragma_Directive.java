package source_unit;

import java.util.ArrayList;
import java.util.List;



public class Pragma_Directive {
	public List<Attributes> attributes;
	
	public Pragma_Directive() {
		this.attributes= new ArrayList<>();
	}
	
	public void addAttribute(Attributes a) {
		attributes.add(a);
	}

}
