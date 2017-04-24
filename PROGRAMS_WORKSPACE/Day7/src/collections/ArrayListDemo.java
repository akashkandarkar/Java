package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add(11);
		a.add(22);
		a.add("good");
	
		
		
		//1
		System.out.println(a);

		//2 LOOP
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.print(a.get(i)+" ");
		}
		System.out.println("\n");
		
		//Iterator
		Iterator t=a.iterator();
		
		while(t.hasNext())
		{
			System.out.print(t.next()+" ");
		}
		
	
	
	}
	

}
