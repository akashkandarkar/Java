
public class MyThread extends Thread 
{

	public MyThread(String string) {
		// methods from thread class
		this.setName(string);
	}


	@Override
	public void run() 
	{
		System.out.println("Hello "+this.getName());
	}


	public static void main(String[] args) {
		MyThread m= new MyThread("1");
		MyThread m1=new MyThread("2");
		MyThread m2 = new MyThread("3");
		MyThread m3= new MyThread("4");
		MyThread m4=new MyThread("5");
		MyThread m5 = new MyThread("6");

		
	
		
		
		m1.start();
		m2.start();
		
		m4.start();
		m5.setPriority(Thread.MAX_PRIORITY);//DOESNT WORK 
		m3.start();
		m5.start();
		m.start();
	}
}
