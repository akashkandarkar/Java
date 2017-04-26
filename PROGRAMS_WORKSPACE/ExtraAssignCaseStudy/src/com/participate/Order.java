package com.participate;

import java.util.Date;

public class Order {

	private String orederId;
	private String orderDetails;
	private Date orderDate;
	
	@Override
	public String toString() {
		return "Order [orederId=" + orederId + ", orderDetails=" + orderDetails
				+ ", orderDate=" + orderDate + "]";
	}

	public Order(String orederId, String orderDetails, Date orderDate) throws OrderNotValidException  {
		super();
		if(orederId.length()>=3 && orederId.charAt(0)=='O' ){
		this.orederId = orederId;
		this.orderDetails = orderDetails;
		this.orderDate = orderDate;
		}
		else
		{
			throw new OrderNotValidException("Invalid Data");
		}
		
	}

}
