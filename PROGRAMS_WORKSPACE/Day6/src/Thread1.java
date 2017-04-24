
public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hi");
		System.out.println(Thread.currentThread().getName());


	}
	public static void main(String[] args) {
		Thread1 t1= new Thread1();

		Thread t= new Thread(t1,"akash");
		
		t.start();

	}

}
