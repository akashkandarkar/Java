import com.sun.corba.se.spi.orbutil.fsm.State;


public class Customer 
{
	private String custId;
	private String custName;
	private int custMobile;
	private static int count;
	static
	{
		count=0;
	}
	public Customer() {
		super();
		count++;
	}


	public Customer(String custId, String custName, int custMobile) 
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
		count++;
		
	}

	public void showCust() {
		System.out.println(this.custId);
		System.out.println(this.custName);
		System.out.println(this.custMobile);
		
	}
	public static void showCount() {
		System.out.println(count);
	}
}
