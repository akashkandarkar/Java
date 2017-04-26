package com.participate;

import java.util.Date;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter cust deatails:");
		System.out.println("cust no");
		int custNo=sc.nextInt();

		System.out.println("cust name");
		String custName=sc.next();
		Customer c=new Customer(custNo, custName);

		System.out.println("Enter order deatails:");
		System.out.println("Order Id");
		String orderId=sc.next();

		System.out.println("Order Details");
		String orderDetails=sc.next();

		System.out.println("Order Date");
		System.out.println("Type year: ");int y =sc.nextInt();
		System.out.println("Type month: ");int m =sc.nextInt();
		System.out.println("Type day: ");int d = sc.nextInt();
		Date orderDate=new Date(y, m, d);

		
		try {

			Order o=new Order(orderId, orderDetails, orderDate);
			MyShopping ms=new MyShopping(c,o);
			ms.storeRecord("records.dat");
			ms.getRecord("records.dat");
		


		} catch (OrderNotValidException message) {
			// TODO Auto-generated catch block
			System.out.println(message);
		}

		
		//			System.out.println(ms.ht.entrySet());

	}

}
