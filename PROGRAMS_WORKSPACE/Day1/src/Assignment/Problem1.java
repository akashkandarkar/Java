package Assignment;



public class Problem1 
{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
