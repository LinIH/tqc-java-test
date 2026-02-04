
class Magazine extends Publication{
	private String issueNumber;

	Magazine(String isbn, String title, String author, String issueNumber){
		super(isbn, title, author);
		this.issueNumber = issueNumber;
	}

	public void displayInfo(){
		System.out.printf("[Magazine] ISBN: %s,  Title: %s, Author: %s, Issue: %s\n", this.getIsbn(), this.getTitle(), this.getAuthor(), this.issueNumber);
	}
}