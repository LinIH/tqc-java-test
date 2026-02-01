
class Book implements Comparable<Book>{
    private String isbn;
    private String title;
    private int price;

    Book(String isbn, String title, int price){
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Book b){
        return this.isbn.compareTo(b.isbn);
    }

    @Override
    public String toString(){
        return String.format("Book{isbn='%s', title='%s', price=%d}", this.isbn, this.title, this.price);
    }

    public int getPrice(){
        return this.price;
    }
}