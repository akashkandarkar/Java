package Assignment;

import java.util.ArrayList;

public class Student {

	

	private ArrayList<String> names=new ArrayList<String>();
	public void setNames(String s) {
		names.add(s);
	} 
	public void searchName(String name) {
		
		int s =names.indexOf(name);
		System.out.println("Search by String index:"+s);
		
		
		
	}
	public void searchName(int index) {
		
		String s=names.get(index);
		System.out.println("Search by index name: "+s);
	}
	public void printNames( ) {
		System.out.println("\nPrinting names:");
		System.out.println(names);
	}
	public void removeName( String stuName ) {
		names.remove(stuName);
	}


}
