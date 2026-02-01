import java.util.*;

class BookStore{
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("012", "title01", 100));
        books.add(new Book("115", "title02", 50));
        books.add(new Book("088", "title03", 150));
        Collections.sort(books);
        System.out.println("Sorted by ISBN:");
        System.out.println(books.toString());

        System.out.println("Sorted by Price (Desc):");
        Collections.sort(books, (a, b) -> b.getPrice() - a.getPrice());
        System.out.println(books.toString());
    }
}