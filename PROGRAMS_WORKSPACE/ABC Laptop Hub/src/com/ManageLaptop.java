package com;

import java.io.Serializable;
import java.util.Vector;

import com.beans.Laptop;

public class ManageLaptop implements Serializable {

	Vector<Laptop> v=new Vector<Laptop>();

	@Override
	public String toString() {
		return "ManageLaptop [v=" + v + "]";
	}
	public ManageLaptop() {
		super();
	}
	public void addLaptop(Laptop l){
		v.add(l);

	}
	public Vector<Laptop> getLaptops(){
		
		return v;//clear

	}
	public Laptop searchLaptop(String id){
		if(v.contains(id))
		{
			System.out.println(v.toString());
		}
		return null;//clear

	}
	


	public ManageLaptop(Vector<Laptop> v) {
		super();
		this.v = v;
	}
	public Vector<Laptop> getV() {
		return v;
	}
	public void setV(Vector<Laptop> v) {
		this.v = v;
	}
	

}
