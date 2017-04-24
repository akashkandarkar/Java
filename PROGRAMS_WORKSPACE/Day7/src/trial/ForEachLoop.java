package trial;

import java.util.ArrayList;

public class ForEachLoop {
	
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(5);
	al.add(6);
	al.add(6);
	al.add(4);
	al.add(8);
	
	for(int a:al)
	{
		System.out.println(a);
	}
	
}
	

}
