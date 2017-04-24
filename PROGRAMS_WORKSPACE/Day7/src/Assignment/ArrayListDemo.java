package Assignment;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		Student s= new Student();
		
		s.setNames("akash");	
		s.setNames("akash motha");
		s.setNames("akash khup motha");
		s.setNames("akash ajun mothach motha");
		
		s.searchName("akash motha"); 
		s.searchName(2); 
		s.printNames();
		s.removeName("akash khup motha"); 
		
		s.printNames();
	}

}
