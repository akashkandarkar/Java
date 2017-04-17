package Assign;

public class Employee 
{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public static void main(String[] args) 
	{
		Employee e= new Employee(1,"akash");
		Employee e1= new Employee(1,"akash");
		
		System.out.println("is e equal to e1 :"+e.equals(e1));
		System.out.println("e stores: "+e);
		System.out.println("e1 stores: "+e1);
	}

}
