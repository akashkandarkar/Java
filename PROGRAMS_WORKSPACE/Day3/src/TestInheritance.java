import java.util.Date;


public class TestInheritance 
{

	public static void main(String[] args) 
	{

		Date d= new Date((2017-1900), 3, 14);
		/*	Associate a=new Associate(1, "akash",d);
			a.showData();
				System.out.println(a);*/
		
		ELITian e= new ELITian(23, "rohit", d, 2045, "TUS-14");
		System.out.println(e);
	}

}
