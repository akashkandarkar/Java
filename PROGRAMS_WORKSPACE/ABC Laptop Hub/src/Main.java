import java.io.FileInputStream;
import java.util.Scanner;

import com.FileOperation;
import com.ManageLaptop;
import com.beans.Laptop;


public class Main {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		Laptop l=null;
		ManageLaptop ml=new ManageLaptop();
		FileOperation fo=new FileOperation();
		
	
		int k=0;
		int ch = 0;
		while(k==0){
			
		
			System.out.println("1.Add Laptop");
			System.out.println("2.Check laptop details by id");
			System.out.println("3.Write laptop details in a file");
			System.out.println("4.Print file details");
			System.out.println("5.Read and print all laptop details from a file");
			System.out.println("6.Exit");
			System.out.println("Select ur choice: ");
			ch=sc.nextInt();
		
			switch (ch){
			case 1:
				 l=new Laptop("LD12345", "singel","hp", 123242);
				ml.addLaptop(l);
				
				break;
			case 2:
				break;
			case 3:
				fo.write(ml.getV());
				break;
			case 4:
				fo.printFileDetails();
				break;
			case 5:
				
				break;
			case 6:
				k=1;
				System.out.println("Thank you");
				break;

			}
		}


	}

}
