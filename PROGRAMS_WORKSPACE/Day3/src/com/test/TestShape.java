package com.test;
import com.shape.*;

public class TestShape 
{

	public static void main(String[] args) 
	{
		System.out.println("Square");
		Square sq= new Square();
		sq.setSide(20);
		sq.calcArea();
		sq.calcPeri();
		
		System.out.println("\nRectangle");
		Rectangle rq=new Rectangle();
		rq.setLength(30);
		rq.setBreadth(20);
		
		rq.calcArea();
		rq.calcPeri();
		
		
		
	}

}
