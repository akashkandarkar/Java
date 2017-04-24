package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PizzaHut {
	public static void main(String[] args) {
		Pizza p=new Pizza("large", 2);
		
		try {
			//serealization
			FileOutputStream fos=new FileOutputStream("pizzainfo.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);	
			oos.writeObject(p);
			fos.close();
			oos.close();
			
			//de-serealization
			FileInputStream fis=new FileInputStream("pizzainfo.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pizza p1=(Pizza) ois.readObject();
			System.out.println(p1.toString());
			
			fis.close();
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
