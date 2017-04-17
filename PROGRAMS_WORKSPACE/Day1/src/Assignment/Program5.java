package Assignment;

import java.util.Arrays;

public class Program5 {


public static void main(String[] args) {
	
	String r;
	String[] str = {"kjgdfc","askfb","cba"};
	int len=str.length;
	String[] f = new String[len];



	

	for(int i=0;i<str.length;i++)
	{
		r=str[i];
		String reverse= new StringBuffer(r).reverse().toString() ;
		f[i]=reverse;
		
	}
	
	Arrays.sort(f);
	System.out.println("Sorted n reverse:");
	for(int i=0; i<f.length;i++)
	{
		System.out.println(f[i]);
	}
	
	
}
}
