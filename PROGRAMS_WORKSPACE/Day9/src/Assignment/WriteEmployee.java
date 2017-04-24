package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteEmployee {

	public static void main(String[] args) {
		Employee e= new Employee(1, "akash", 200);
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		ObjectInputStream ois= null;
		
		try {
			
			fos=new FileOutputStream("emp.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			
			fis=new FileInputStream("emp.txt");
			ois=new ObjectInputStream(fis);
			System.out.println(ois.readObject());
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
