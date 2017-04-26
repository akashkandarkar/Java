package uni.data;

import java.util.Scanner;

public class University {
	static int count;
	private static Professor professor=new Professor();
	Exam exam;
	static Course course=new Course();


	boolean studentVerificationProcess(Student student){

		if(Validator.validateStudent(student))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void writeExamGetResult(Exam exam){

		exam.setMarks(90);

	}

	public void studentAdmission(Student student,Course course){
		System.out.println(student.getName()+" you are registerd successfully , welcome to our university ");
		System.out.println("your student id= "+(++count));
	}

	public void studentCertification(Student student,Course course){
		if(studentVerificationProcess(student))
		{
			studentAdmission(student, course);
			System.out.println(student.getName()+" is registered for "+course.getName());
		}
		else
		{
			System.out.println("Certification not completed");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		Registrar r= null;

		Student s = new Student();
		int valid=0;

		System.out.println("Student need 80 marks to enter in university");
		System.out.println("Enter Student name: ");
		String sName =sc.next();
		s.setName(sName);

		System.out.println("Enter Student age: ");
		s.setAge(sc.nextInt());

		System.out.println("Enter Student marks: ");
		s.setPreviousMarks(sc.nextInt());

		System.out.println("Enter Course id: ");
		int cId=sc.nextInt();

		System.out.println("Enter Course name:");
		String cName=sc.next();


		System.out.println("Enter Course duration: ");
		int cDuration=sc.nextInt();

		Course c= new Course(cId,cName ,cDuration);

		System.out.println("Enter Professor name:");
		professor.setName(sc.next());

		System.out.println("Student "+ sName +" applied for university....");



		professor.setStudent(s);

		Exam e= new Exam();

		University u=new University();
		if(Registrar.registerStudent(s))
		{
			System.out.println();
		}
		else
		{
			System.out.println("\nYou are not registerd because of insufficient marks(previous marks)");
			valid=1;
		}






		if(valid==0)
		{
			u.studentCertification(s,c);

			e.setName(c.getName());
			
			professor.teaches(c);

			professor.conductingExam(e);

			u.writeExamGetResult(e);

			professor.evaluatingExam(e);



			if(e.getMarks()>80)
			{
				System.out.println(s.getName()+" your % is 80 above ");
				System.out.println(s.getName()+" you are java professional certified ");
			}
			else
			{
				System.out.println("\nyou are not certified");
			}
		}
		else
		{
			System.out.println("\nNo futher details cant be shown, you are not registered");
		}


	}

}
