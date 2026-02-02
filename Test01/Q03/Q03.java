
class Q03{
    public static void main(String[] args){
        Package p1 = new StandardPackage("P01", 3.5);
        Package p2 = new ExpressPackage("P02", 4.3);
        Package p3 = new OversizePackage("P03", 21);
        
        ShippingDB shipping = new ShippingDB();
        shipping.addPackage(p1);
        shipping.addPackage(p2);
        shipping.addPackage(p3);

        if(shipping.findHeaviestPackage() == null) System.out.println("null");
        else{
            System.out.printf("Total revenue for all packages:%.1f\n", shipping.calculateTotalRevenue());
            System.out.printf("Heaviest package:%s, weight:%.1fkg", shipping.findHeaviestPackage().trackingNumber, shipping.findHeaviestPackage().weight);
        }
    }
}