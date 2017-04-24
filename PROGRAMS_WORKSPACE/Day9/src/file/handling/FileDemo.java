package file.handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File f= new File("data.txt");
		if (f.exists()) {
			System.out.println("exists");
		}
		else
		{
			try {
				if(f.createNewFile())
				{
					System.out.println("Created");
				}
				else
				{
					System.out.println("not created");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
