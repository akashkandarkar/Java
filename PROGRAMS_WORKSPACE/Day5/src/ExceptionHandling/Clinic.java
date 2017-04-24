package ExceptionHandling;

import java.util.Scanner;



public class Clinic 
{

	public static void main(String[] args) 
	{
		Doctor1 d=new Doctor1();
		Scanner sc= new Scanner(System.in);
		try {
		
		System.out.println("eneter doc degeree");
		String deg=sc.nextLine();
		d.setDegree(deg);
		
		System.out.println("enter name");
		String name=sc.next();
		
		d.setName(name);
		
		
			
		} catch (DoctorException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(d.toString());
	}

}
