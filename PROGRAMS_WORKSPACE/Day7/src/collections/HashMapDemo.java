package collections;

import java.util.Enumeration;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "akash");
		hm.put(2, "ishan");
		System.out.println(hm);
		
		/*Enumeration e=(Enumeration) hm.entrySet();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}*/
		
		
		
	}
}
