package Assignment;

import java.io.File;

public class DirectoryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("akash");
		f.exists();
		System.out.println("in dir : "+f.toString());
		if(f.isDirectory())
		{
			String str[]=f.list();
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
			
		}
	}

}
