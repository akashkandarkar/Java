package ExceptionHandling;

import java.util.Scanner;

public class Demo2 
{
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		System.out.println("enter number in array:");
		int loc=sc.nextInt();
		try 
		{
			System.out.println(arr[loc]);
		} 
		catch (ArrayIndexOutOfBoundsException ar) 
		{
			System.err.println("dokyavar padala ka!!!!!");
		}
		
		String str="akash";
		System.out.println("enter index of char:");
		int ind=sc.nextInt();
		try {
			System.out.println(str.charAt(ind));
		} catch (StringIndexOutOfBoundsException se) 
		{
			// TODO Auto-generated catch block
		System.err.println("doka ahe ka tula adhi tharav..");
		}
	}
}
