package Assignment;

public class Counter extends Thread{
	
	Storage s;
	
	
	public Counter(Storage s) {
		super();
	
		this.s = s;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			s.setCount(i);
			System.out.println("in counter"+i);
		
			
		}
		
		
	}

}
