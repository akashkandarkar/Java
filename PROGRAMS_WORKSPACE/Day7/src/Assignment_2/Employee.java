package Assignment_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {
	
	
		private HashMap<Integer, String> empNames= new HashMap<Integer, String>();
		private HashMap<Integer, String> map;
		
		public void setNames(Integer roll,String name){	
			empNames.put(roll, name);
		}
		public void printNames() {
			System.out.println(empNames.values());
		}
		
		public void getName(int key ) {
			if(empNames.containsKey(key))
			{
			System.out.println("in search name is "+empNames.get(key));
			}
			else
			{
				System.out.println("key not present");
			}
		}
		
		public void printNamesKeySet( ){
		
			/*Set s=empNames. ;
			Iterator itr = s.iterator();
		      System.out.println(s);
			   // check values
			   while (itr.hasNext()){
				   int n=(Integer) itr.next(); 
				System.out.println(empNames.get(n));
			   }*/
			
			/*for (Entry<Integer, String> entry : empNames.entrySet()) {
				  Integer key = entry.getKey();
				  String value = entry.getValue();
				  System.out.println("key: "+key+" value: "+value);
				  // do stuff
				}*/
			   Iterator i=empNames.entrySet().iterator();
			  while (i.hasNext()) {
				  
				Map.Entry me=(Entry) i.next();
				
				System.out.print(me.getKey()+" ");
				System.out.println(me.getValue());
				
			}
			   
			
		}
		
		public void printSize( ){
		System.out.println("size is "+empNames.size());
		}
		
		public void remove( int i ){
			empNames.remove(i);
			System.out.println("removed: "+i);
		}
		
		
			
			
		
		
	}

