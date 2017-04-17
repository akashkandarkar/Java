package Assignment;

public class Program4 
{
	public static void main(String[] args) 
	{
		int[] stArray={20,15,45,32,22};
		int num=Integer.parseInt(args[0]);
		for(int i = 0; i<stArray.length;i++)
		{
			if(num==stArray[i])
			{
				System.out.println("Bingo");
			}
		}
	}
}
