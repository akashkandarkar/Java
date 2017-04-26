package com.participate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import javax.swing.text.html.HTML;

public class MyShopping {

	private Hashtable < Customer,Order> ht= new Hashtable<Customer,Order>();

	
	public MyShopping(Customer c, Order o) {
		this.ht.put(c, o);
	}
	public void storeRecord(String filename) {
		File f=new File(filename);
		FileOutputStream fos=null;
		try {
			
			fos = new FileOutputStream(f);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeBytes(ht.toString());
			
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	public void getRecord(String  filename) 
	{
		File f=new File(filename);
		try {
			
			FileInputStream fis=new FileInputStream(f);
			int ch;
			while((ch=fis.read())!=-1)
			{
				System.out.print((char)ch);
			}
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public String toString() {
		return "MyShopping [ht=" + ht + "]";
	}
	
	

	
}
