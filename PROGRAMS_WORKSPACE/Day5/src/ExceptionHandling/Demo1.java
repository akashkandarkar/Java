package ExceptionHandling;

import java.util.Scanner;

public class Demo1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("dividend:");
		int num=sc.nextInt();
		System.out.println("divisor:");
		int den=sc.nextInt();

		float result = 0;
		try 
		{
			result = num/den;
			System.out.println("result"+result);
		} 
		catch (ArithmeticException ae) 
		{
			// TODO Auto-generated catch block
			System.err.println("you have entered 0, invalid data.");
		}

	}
}
