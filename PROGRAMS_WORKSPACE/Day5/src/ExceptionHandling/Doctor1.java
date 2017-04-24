package ExceptionHandling;

import java.util.Scanner;



public class Doctor1 
{
	private String degree;
	private String name;
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) throws DoctorException {
		if(degree.equalsIgnoreCase(null) || degree.isEmpty() || degree.length()==0)
		{	
			throw new DoctorException("degree invalid");
		}
		else
		{	
			this.degree = degree;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Doctor [degree=" + degree + ", name=" + name + "]";
	}
	
	 
}
