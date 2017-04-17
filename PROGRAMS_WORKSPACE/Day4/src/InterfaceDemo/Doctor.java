package InterfaceDemo;

import java.util.Scanner;

public class Doctor implements MyInterface
{
	private String degree;
	private String name;
	private String get_degree;
	private String get_name;
	Scanner sc=new Scanner(System.in);
	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("ENTER degree:");
		get_degree=sc.next();
		System.out.println("ENTER name:");
		get_name=sc.next();
		
	}
	@Override
	public void putData(){
		System.out.println("degree:" + get_degree);
		
		System.out.println("name:"+get_name);
		
		
	}
	 
}
