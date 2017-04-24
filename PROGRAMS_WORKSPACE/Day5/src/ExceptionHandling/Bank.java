package ExceptionHandling;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account a= new Account();
		try {
			a.setAccId(sc.next());
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			/*e.printStackTrace();*/
			System.out.println(e.getMessage());
		}
		
		a.setAccType(sc.next());
		System.out.println(a);
	}
}
