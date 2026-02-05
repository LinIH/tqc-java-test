import java.util.*;

class Order {
    private List<OrderItem> items;

    public Order(List<OrderItem> items) {
        this.items = items;
    }

    // Getter
    public List<OrderItem> getItems() { return items; }
}