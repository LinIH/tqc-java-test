public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Gaming Laptop", 45000, 10);
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 10 units

        boolean success = laptop.sell(3);
        System.out.println("Sale successful: " + success); // Sale successful: true
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 7 units

        success = laptop.sell(8);
        System.out.println("Sale successful: " + success); // Sale successful: false
        System.out.println(laptop.getInfo()); // ID: P001, Name: Gaming Laptop, Price: $45000, Stock: 7 units
    }
}