package com.shape;

public class Square implements Polygon {

	float side;
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float result;
		result=side*side;
		System.out.println("Area: "+result);

	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float result;
		result=side*4;
		System.out.println("Perimeter: "+result);
	}

}
