import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Main_Q4{
	public static void main(String[] args){
		Inventory<Product> inv = new Inventory<>();
		inv.addProduct(new Product("P001", "Mouse", 500));
		inv.addProduct(new Product("P002", "Laptop", 1500));
		inv.addProduct(new Product("P003", "Keyboard", 80));

		System.out.println("Products with price > 1000:");
		List<Product> expensiveProducts = inv.getAllProducts().stream()
			.filter(x -> x.getPrice() > 1000)
			.collect(Collectors.toList());
		System.out.println(expensiveProducts.toString());


		double sum =  inv.getAllProducts().stream().mapToDouble(Product::getPrice).reduce(0, Double::sum);
		System.out.println("\nTotal inventory value: " + sum + "\n");

		List<String> s = inv.getAllProducts().stream().sorted((a, b) -> a.getName().compareTo(b.getName())).map(Product::getName).collect(Collectors.toList());
		System.out.println("Product names sorted:");
		System.out.println(s.toString());
	}
}