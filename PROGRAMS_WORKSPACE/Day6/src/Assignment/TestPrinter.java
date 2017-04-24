package Assignment;

public class TestPrinter
{
public static void main(String[] args) {
	Storage s= new Storage();
	s.start();
	
	Counter c= new Counter(s);
	Printer p=new Printer(s);
	c.start();
	
	//p.setPriority(10);
	p.start();
	
	
}

}
