package serialization;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WritePizzaToFile {
public static void main(String[] args) {
	

	//1. Create an object
	Pizza p=new Pizza("large", 2);

	//2. write an object into the file - FOS , DOS
	try {

		FileOutputStream fos=new FileOutputStream("pizzainfo.txt");

		DataOutputStream dos= new DataOutputStream(fos);

		dos.writeBytes(p.toString());





	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
