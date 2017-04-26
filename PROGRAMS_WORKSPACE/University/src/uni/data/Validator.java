package uni.data;

public class Validator {
	
	
	
	public static boolean validateStudent(Student student){
		
		
		int pMarks =student.getPreviousMarks();
		if(pMarks>80)
		{
			return true;
		}
		else
		{
		return false;
		}
		 
		
	}

}
