
class Main{
    public static void main(String[] args){
        Library library = new Library();
        library.addBook(new Book("hello world", "C++"));
        library.addBook(new Book("java 17", "java"));
        library.addBook(new Book("Operating System", "unknown"));

        library.printAllBooks();
        
        Book book1 = library.findBookByTitle("java 17");
        Book book2 = library.findBookByTitle("Computer Science");
        printBook(book1);
        printBook(book2);
    }

    public static void printBook(Book book){
        if(book == null){
            System.out.println("book not founded");
        }
        else{
            System.out.println("book title: " + book.title() + ", author: " + book.author());
        }
    }
}