package com.participate;

public class Customer {

	private int custNo;
	private String custName;
	
	public Customer(int custNo, String custName) {
		super();
		this.custNo = custNo;
		this.custName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + "]";
	}
	
	

}
