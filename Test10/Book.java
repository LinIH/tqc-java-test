
class Book{
	private String title;
	private String author;
	private int publicationYear;
	private double price;
	private int stock;
	private String category;

	Book(String title, String author, int publicationYear, double price, int stock, String category){
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}

	public String getTitle(){ return this.title;}
	public String getAuthor(){ return this.author;}
	public int getPublicationYear(){ return this.publicationYear;}
	public double getPrice(){ return this.price;}
	public int getStock(){ return this.stock;}
	public String getCategory(){ return this.category;}

	public String toString(){
		return String.format("Book{title='%s', author='%s', publicationYear=%d, price=%.1f, stock=%d, category='%s'}", this.title, this.author, this.publicationYear, this.price, this.stock, this.category);
	}
}