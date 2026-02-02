
public class Product{
	private String productId;
	private String name;
	private int price;
	private int stock;

	Product(String productId, String name, int price, int stock){
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public boolean sell(int quantity){
		if(quantity <= this.stock){
			this.stock -= quantity;
			return true;
		}
		else{
			return false;
		}
	}

	public String getInfo(){
		return String.format("ID: %s, Name: %s, Price: $%d, Stock: %d units", this.productId, this.name, this.price, this.stock);
	}

	public String getProductId(){
		return this.productId;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	public int getStock(){
		return this.stock;
	}

}