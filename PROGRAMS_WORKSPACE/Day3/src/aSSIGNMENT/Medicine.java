package aSSIGNMENT;

import java.util.Date;

public abstract class Medicine 
{
	private int price;
	private Date expiry_date;
	public void getDetails(){
		System.out.println(price);
		System.out.println(expiry_date);
	}
	public abstract void displayLabel();
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}
	
}
