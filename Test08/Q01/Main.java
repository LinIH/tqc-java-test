import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 1200.00),
            new Product("Smartphone", "Electronics", 800.00),
            new Product("Desk Chair", "Furniture", 150.00),
            new Product("Headphones", "Electronics", 99.99),
            new Product("Coffee Maker", "Appliances", 75.50),
            new Product("Monitor", "Electronics", 300.00)
        );

        List<String> nameList = products.stream()
            .filter(x -> "Electronics".equals(x.getCategory()))
            .filter(x -> x.getPrice() > 100)
            .map(s -> s.getName().toUpperCase())
            .collect(Collectors.toList());

        System.out.println(nameList.toString());
    }
}