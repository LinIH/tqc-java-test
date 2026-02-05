
class OrderItem {
    private String bookTitle;
    private int quantity;

    public OrderItem(String bookTitle, int quantity) {
        this.bookTitle = bookTitle;
        this.quantity = quantity;
    }

    // Getters
    public String getBookTitle() { return bookTitle; }
    public int getQuantity() { return quantity; }
}