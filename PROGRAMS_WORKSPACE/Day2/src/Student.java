
public class Student 
{
	private int rollno;
	private String name;
	
	public Student()
	{
		System.out.println("in default constructor");
	}
	
	public Student(int roll,String Sname)
	{
		rollno=roll;
		name=Sname;
	}
	int getRoll()
	{
		return rollno;
		
	}
	
	String getName()
	{
		return name;
	}
	
	public void showStud()
	{
		System.out.println("Roll no:"+rollno+"\nName:"+name);
	}
}
