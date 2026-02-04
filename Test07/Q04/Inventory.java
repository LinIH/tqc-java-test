import java.util.*;

class Inventory<T extends Product>{
	private Map<String, T> products = new HashMap<>();

	public void addProduct(T product){
		products.put(product.getId(), product);
	}

	public Collection<T> getAllProducts(){
		return products.values();
	}
}