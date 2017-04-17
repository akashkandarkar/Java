
public class EngineeringBook extends Book {

	

	private String category;

	public EngineeringBook(int bookNo, String title, String author,
			float price, String category) 
	{
		super(bookNo, title, author, price);
		this.category = category;
	}
	
	

	@Override
	public String toString() {
		return "EngineeringBook \ncategory=" + category + ",\nBookNo="
				+ getBookNo() + ", \nTitle=" + getTitle() + ", \nAuthor="
				+ getAuthor() + ", \nPrice=" + getPrice();
				
			
	}


	
	
	
	

}
