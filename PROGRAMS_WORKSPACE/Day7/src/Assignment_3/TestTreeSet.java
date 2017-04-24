package Assignment_3;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("akashafdgjasf");
		ts.add("akash");
		ts.add("akash");
		ts.add("akasha");
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		System.out.println("first:"+ts.first());
		System.out.println("last:"+ts.last());
		System.out.println("size:"+ts.size());
		
		ts.remove("akasha");
		System.out.println(ts);
		System.out.println("size:"+ts.size());
	}

}
