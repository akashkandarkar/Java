package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import com.beans.Laptop;

public class FileOperation {

	File f=new File("lappies.txt");
	FileOutputStream fos;
	ObjectOutputStream oos;
	FileInputStream fis;
	ObjectInputStream ois;
	
	public boolean write(Vector<Laptop> v) 
	{
		if(f.exists()){
			try {
				fos = new FileOutputStream(f);
				oos=new ObjectOutputStream(fos);
				oos.writeObject(v);
				return true;

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return false;
	}
	public Vector<Laptop> read(){
	
			try {
		
			
			fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
	return (Vector<Laptop>) ois.readObject();
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		

	}
	public void printFileDetails(){
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println("space:"+f.getTotalSpace());

	}
}
