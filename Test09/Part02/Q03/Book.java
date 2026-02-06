
record Book(String isbn, String title, String author){
	@Override
	public String toString(){
		return String.format("Book[isbn=%s, title=%s, author=%s]\n", this.isbn, this.title, this.author);
	}
}