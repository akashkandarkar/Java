package com.participate;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileDemo {
	static ArrayList<String> arr=new ArrayList<String>();
	static{
		File f=new File("input.dat");
		int count =0;
		try {

			//FileInputStream fis=new FileInputStream(f);
			Scanner sc=new Scanner(f);
			
			while (sc.hasNextLine()) {
				arr.add(sc.nextLine());
			}
			File fr=new File("output.dat");
			FileOutputStream fos=new FileOutputStream(fr);
			DataOutputStream dos=new DataOutputStream(fos);
		for (int i = 0; i < arr.size(); i++) {
			dos.writeBytes(arr.get(i)+"\n");
		
		}
				
		

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//DISLAYING ARRAYLIST
	public static void main(String[] args) {

		for (int i = 0; i < arr.size(); i++) {
			System.out.println((i+1)+" "+arr.get(i));
		}


	}

}
