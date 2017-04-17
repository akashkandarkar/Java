package InterfaceDemo;

public class Demo {

	public static void main(String[] args) {
		
		String s="akash";
		System.out.println(s.hashCode());
		s=s+"hi";
		System.out.println(s.hashCode());
	
		StringBuffer s1=new StringBuffer("akash");
		System.out.println(s1.hashCode());
		s1=s1.append("hi");
		System.out.println(s1.hashCode());
	
		StringBuilder s2=new StringBuilder("akash");
		System.out.println(s2.hashCode());
		s2=s2.append("sdsdgas");
		System.out.println(s2.hashCode());
	
	}
}
