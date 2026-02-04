
class Product{
	public String id;
	public String name;
	public double price;

	Product(String id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	public double getPrice(){
		return this.price;
	}

	public String toString(){
		return String.format("[Product{id='%s', name='%s', price=%.1f}]", this.id, this.name, this.price);
	}
}