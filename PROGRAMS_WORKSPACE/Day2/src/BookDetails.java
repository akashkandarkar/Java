import java.util.Scanner;


public class BookDetails 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	Scanner s=new Scanner(System.in);
		
		System.out.println("how many books you want to enter in database" );
		
		int num_of_books=s.nextInt();
		
		Book b[]=new Book[num_of_books];
		
		for(int i=0;i<num_of_books;i++)
		{
			System.out.print("Enter book id:");
			int p_bid=s.nextInt();
			
			System.out.print("Enter title:");
			String p_btitle=s.next();
			
			System.out.print("Enter author:");
			String p_bauthor=s.next();
			
			System.out.print("Enter price:");
			int p_bprice=s.nextInt();
			
			b[i]=new Book();
			b[i].setBookNo(p_bid);
			b[i].setTitle(p_btitle);
			b[i].setAuthor(p_bauthor);
			b[i].setPrice(p_bprice);
			
			
			/*b[i]=new Book(p_bid,p_btitle,p_bauthor,p_bprice);*/
			
		}
		System.out.println("Enter the book no you want to search: ");
		int sid=s.nextInt();
		for(int i=0;i<num_of_books;i++)
		{
			if(sid==b[i].getBookNo())
			{
				System.out.println("Book found");
				System.out.println(b[i]);
			}
		
			
		}
		
		EngineeringBook eb=new EngineeringBook(2, "dgashasfh", "sdgasfhsfh", 4336, "sdgasgasfh");
		System.out.println(eb.toString());
		
	
		
		

	}

}
