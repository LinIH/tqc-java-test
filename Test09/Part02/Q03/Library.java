import java.util.*;

class Library{
	private Map<String, Book> books = new HashMap<>();

	public void addBook(Book book){
		books.put(book.isbn(), book);
	}

	public Book findBookByIsbn(String isbn){
		System.out.printf("Searching for book with %s...\n", isbn);
		Book b = books.get(isbn);
		if(b == null){
			System.out.printf("Book not found.\n");
		}
		else{
			System.out.printf("Found: %s\n", b.toString());
		}
		return b;
	}

	public void displayAllBooks(){
		System.out.println("All books in the library:");
		books.values().stream().forEach(b -> {
			System.out.print(b.toString());
		});
	}
}