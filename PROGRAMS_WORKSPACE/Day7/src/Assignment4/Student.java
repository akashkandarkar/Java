package Assignment4;

public  class Student implements Comparable<String> {
	private int rollno;
	private String name;


	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(String o) {
		if(this.name==o){
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}
		
		return 0;
		
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}


	


	
}
