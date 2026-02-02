
class Q03{
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("P003", "Laptop", 1200.5));
        inventory.addProduct(new Product("P001", "Mouse", 1000));
        inventory.addProduct(new Product("P002", "Keyboard", 1100));

        Product mostP = inventory.findMostExpensiveProduct();
        System.out.printf("Most expensive product: %s - %s - Price: %.1f\n", mostP.getProductId(), mostP.getName(), mostP.getPrice());
        System.out.println("--- Sorted Inventory ---");
        inventory.sortProductsByName();
        for(Product p:inventory.products){
            System.out.printf("ID: %s, Name: %s\n", p.getProductId(), p.getName());
        }
    }
}