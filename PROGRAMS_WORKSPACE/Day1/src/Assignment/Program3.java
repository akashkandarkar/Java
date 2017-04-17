package Assignment;

public class Program3 
	{
		public static void main(String[] args) {
			 int n1=Integer.parseInt(args[0]);
			 int n2=Integer.parseInt(args[1]);
			 char c=args[2].charAt(0);
			 int result=0;
			 int ascii=(int) c;
			
			 
			switch (ascii) 
			{
			case 47:
					if(n2>n1)
					{
						result=n1/n2;
					}
					else
					{
						result=n2/n1;
					}
					break;
					
			case 46:
					
					result=n1*n2;
					break;
			case 45:
				if(n2>n1)
				{
					result=n2-n1;
				}
				else
				{
					result=n2-n1;
				}
					break;
			case 43:
					result=n1+n2;
					break;
			
			}
			System.out.println(result);
		}
	}
