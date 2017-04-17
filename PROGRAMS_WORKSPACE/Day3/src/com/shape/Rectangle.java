package com.shape;

public class Rectangle implements Polygon {

	float length;		
	float breadth;

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float result;
		result=length*breadth;
		System.out.println("Area: "+result);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float result;
		result=(2*length)+(2*breadth);
		System.out.println("Perimeter: "+result);

	}

}
