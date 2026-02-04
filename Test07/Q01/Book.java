
class Book{
	private String isbn;
	private String title;
	private String author;

	public Book(String isbn, String title, String author){
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

	public void displayInfo(){
		System.out.printf("ISBN: %s\nTitle: %s\nAuthor: %s\n", this.isbn, this.title, this.author);
	}
}