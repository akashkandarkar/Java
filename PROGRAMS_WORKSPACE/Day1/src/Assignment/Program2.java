package Assignment;


public class Program2 
{
	public static void main(String[] args) 
	{
		int len=args.length;
		int[] arr=new int[len];
		int sum=0,avg=0;
		for(int i=0; i<len;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum is: "+sum);
		avg=sum/len;
		System.out.println("avarage is:"+avg);
		
	}
}
