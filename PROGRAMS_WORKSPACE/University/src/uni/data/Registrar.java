package uni.data;

public class Registrar {

	public static boolean registerStudent(Student s){


		System.out.println("Register has sent your details to validator....plaese wait...");
		System.out.println("validator is validation your details "+s.getName()+" please wait...");
		if(Validator.validateStudent(s))
		{
			return true;
		}
		else
		{
			return false;
		}//clear
	}
}
