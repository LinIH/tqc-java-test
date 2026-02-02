import java.util.*;
class Inventory{
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p){
        this.products.add(p);
    }
    public Product findMostExpensiveProduct(){
        Product mostProduct = this.products.get(0);
        for(Product p:products){
            if(mostProduct.getPrice() < p.getPrice()) mostProduct = p;
        }
        return mostProduct;
    }
    public void sortProductsByName(){
        int len = products.size();
        char n1;
        char n2;
        for(int i = 1; i < len ; i++){
            n1 = products.get(i).getName().charAt(0);
            for(int j = i - 1; j >= 0; j--){
                n2 = products.get(j).getName().charAt(0);
            System.out.println(n1 + " " + n2);
                if(n1 > n2){
                    products.add(j, products.get(i));
                    products.remove(i);
                    break;
                }
            }
        }
    }

}