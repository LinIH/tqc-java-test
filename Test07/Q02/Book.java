
class Book extends Publication{

	Book(String isbn, String title, String author){
		super(isbn, title, author);
	}

	public void displayInfo(){
		System.out.printf("[Book] ISBN: %s,  Title: %s, Author: %s\n", this.getIsbn(), this.getTitle(), this.getAuthor());
	}
}