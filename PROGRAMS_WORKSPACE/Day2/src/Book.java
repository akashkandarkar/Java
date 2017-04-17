import java.util.InputMismatchException;

/*Create a class Book which has following members:
	private int bookNo
	private String title
	private String author
	private float price
	Provide getter and setter methods for all the instance variables.
	Create a class BookDetails which has the main method. Create an object of the Book class.
	Initialize the object by reading inputs for the fields from the user. */
public class Book 
{

	public Book() {
		super();
	}

	private int bookNo;
	private String title;
	private String author;
	private float price;

	int k=0;



	public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		if(this.title.length()<4)
		{
			System.out.println("Title name length insufficient ");
			k=1;

		}
		this.author = author;
		if(price>1 && price<5000)
		{
			try {
					this.price = price;
				} 
			
			catch (InputMismatchException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("Invalid data type ");
			}

		}
		else
		{
			k=1;
			System.out.println("Invalid price");
		}
	}

	public int getBookNo() 
	{
		return bookNo;
	}

	public void setBookNo(int bookNo) 
	{
		this.bookNo = bookNo;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public float getPrice() 
	{
		return price;
	}

	public void setPrice(float price) 
	{
		this.price = price;
	}

	@Override
	public String toString() {
		if(k==0){

			return "Book bookNo=" + bookNo + ", title=" + title + ", author="
					+ author + ", price=" + price ;}
		else
		{
			return "Invalid data";
		}
	}

}
