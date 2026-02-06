
class Main{
	public static void main(String[] args){
		Library lib = new Library();
		lib.addBook(new Book("978-0321765723", "The C++ Programming Language", "Bjarne Stroustrup"));
		lib.addBook(new Book("978-0132350884", "Clean Code", "Robert C. Martin"));
		lib.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch"));

		lib.displayAllBooks();

		Book b1 = lib.findBookByIsbn("978-0134685991");
		Book b2 = lib.findBookByIsbn("000-0000000000");
	}
}