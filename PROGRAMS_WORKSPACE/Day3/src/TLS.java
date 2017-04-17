import java.util.Scanner;


public class TLS {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		//up casting
		Person p= new Trainer(sc.next(),sc.next() , sc.next(), sc.nextInt(), sc.nextInt());
		p.showdetails();
		
		//down casting
		Trainer t=(Trainer) p;
		t.TrainerKaMethod();
	}

}
