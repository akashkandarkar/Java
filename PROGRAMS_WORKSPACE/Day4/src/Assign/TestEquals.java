package Assign;

public class TestEquals 
{
	int a;

	public TestEquals(int a) {
		super();
		this.a = a;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		TestEquals t=(TestEquals) obj;
		if(this.a==t.a)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		TestEquals te=new TestEquals(51);
		TestEquals te1=new TestEquals(5);

		System.out.println(te.equals(te1));
	}





}
