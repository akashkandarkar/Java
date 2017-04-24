package Assignment;

public class Printer extends Thread 
{
	Storage s;
	
 public Printer(Storage s) {
		super();
		this.s = s;
	/*	System.out.println("in print constrct"+s.getCount());*/
	}

@Override
public void run() {
	// TODO Auto-generated method stub
	//for (int i = 0; i < 10; i++) {
	
	try {
		sleep((long) 0.809);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		System.out.println("in printer  "+s.getCount());
		
		
	//}
}
}
