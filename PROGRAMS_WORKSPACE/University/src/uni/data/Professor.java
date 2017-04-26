package uni.data;

public class Professor {
	private String name;
	private Student student;
	
	
	
	public void teaches(Course course){
		System.out.println(this.name+" is teaching "+course.getName()+" to "+student.getName());
	}
	public void conductingExam(Exam exam){
		System.out.println(this.getName()+" is conducting "+exam.getName()+" to "+student.getName());
	}
	
	public void evaluatingExam(Exam e) {
		System.out.println(this.getName()+"is evaluating "+student.getName()+" "+e.getName()+"exam paper");
		System.out.println("Marks--->"+e.getMarks());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
