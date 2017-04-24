package serialization;

import java.io.Serializable;

public class Pizza implements Serializable {

	String name;
	int quantitiy;
	public Pizza(String name, int quantitiy) {
		super();
		this.name = name;
		this.quantitiy = quantitiy;
	}
	@Override
	public String toString() {
		return "Pizza [name=" + name + ", quantitiy=" + quantitiy + "]";
	}
	
	
}
