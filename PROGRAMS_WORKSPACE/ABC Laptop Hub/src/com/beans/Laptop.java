package com.beans;

import java.io.Serializable;

public class Laptop implements Serializable {

	private String id;
	private String processor;
	private String brand;
	private float price;
	
	public Laptop() {
		super();
		this.id = null;
		this.processor =null;
		this.brand = null;
		this.price = 0;
	}

	public String getId() {
	    return id;
	}

	public void setId(String id)throws InvalidIDException  {
	    if(id.startsWith("LD") &&  id.length()>=7){
		    this.id = id;
	    }
	    else
	    {
		throw new InvalidIDException("Invalid ID");
	    }
	}

	public String getProcessor() {
	    return processor;
	}

	public void setProcessor(String processor) throws InvalidProcessorException {
	    if(processor=="single" || processor=="dual core"||processor=="Triple core" ){
			this.processor = processor;
	    }
	    else{
		throw new InvalidProcessorException("Invalid brand");
	    }
	}

	public String getBrand() {
	    return brand;
	}

	public void setBrand(String brand)throws newInvalidBrandException {
	    if(brand=="hp" || brand=="Toshiba"||brand== "Acer" ){
		this.brand = brand;
	    }
	    else
	    {
		throw new newInvalidBrandException("Invalid brand");
	    }
	}

	public Laptop(String id, String processor, String brand, float price) {
		super();
		
		this.id = id;
		this.processor = processor;
		this.brand = brand;
		this.price = price;
	}

	public float getPrice() {
	    return price;
	}

	public void setPrice(float price) {
	    this.price = price;
	}
	
	
}
