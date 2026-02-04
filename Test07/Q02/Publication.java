
abstract class Publication{
	private String isbn;
	private String title;
	private String author;

	public Publication(String isbn, String title, String author){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public String getIsbn(){
		return this.isbn;
	}

	public String getTitle(){
		return this.title;
	}

	public String getAuthor(){
		return this.author;
	}

	public abstract void displayInfo();
}