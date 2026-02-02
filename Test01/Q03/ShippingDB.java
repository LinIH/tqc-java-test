import java.util.*;

class ShippingDB{
    static HashMap<String, Package> shipping = new HashMap<>();

    void addPackage(Package p){
        shipping.put(p.trackingNumber, p);
    }

    double calculateTotalRevenue(){
        double totalfee = 0;
        for(Package p:shipping.values()){
            totalfee += p.calculateCost();
        }
        return totalfee;
    }

    Package findHeaviestPackage(){
        String trackingNumber = "";
        for(Package p:shipping.values()){
            if("".equals(trackingNumber)) trackingNumber = p.trackingNumber;
            else{
                if(shipping.get(p.trackingNumber).weight > shipping.get(trackingNumber).weight){
                    trackingNumber = p.trackingNumber;
                }
            }
        }

        return "".equals(trackingNumber) ? null : shipping.get(trackingNumber);
    }
}