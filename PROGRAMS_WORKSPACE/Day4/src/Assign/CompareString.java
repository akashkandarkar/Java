package Assign;

public class CompareString {

	public static void main(String[] args) {
		
		String s1="akash";
		System.out.println(s1.hashCode());
		s1=s1+"hi";
		System.out.println(s1.hashCode());
	
		StringBuffer s2=new StringBuffer("akash");
		System.out.println(s2.hashCode());
		s2=s2.append("hi");
		System.out.println(s2.hashCode());
	
		StringBuilder s3=new StringBuilder("akash--");
		System.out.println(s3.hashCode());
		s3=s3.append("sdsdgas");
		System.out.println(s3.hashCode());
	}
}
