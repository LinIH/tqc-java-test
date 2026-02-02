import java.util.*;
class Library{
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book){
        books.add(book);
    }

    Book findBookByTitle(String title){
        for(Book b:books){
            if(b.title().equals(title)) return b;
        }

        return null;
    }

    void printAllBooks(){
        for(Book b:books){
            System.out.println("book title: " + b.title() + ", author: " + b.author());
        }
    }
}