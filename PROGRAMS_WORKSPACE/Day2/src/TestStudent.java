
public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student st1=new Student();
		st1.showStud();

		Student st2=new Student(2,"akash");
		st2.showStud();
		String gname=st2.getName();
		int groll=st2.getRoll();
		System.out.println("Roll no: "+groll+" name: "+gname);

		System.out.println("Roll no: "+st2.getRoll()+" name: "+st2.getName());
	}
}
