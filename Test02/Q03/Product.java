
class Product{
    private String productId;
    private String name;
    private double price;
    
    Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    String getProductId(){
        return this.productId;
    }
    String getName(){
        return this.name;
    }
    double getPrice(){
        return this.price;
    }
}