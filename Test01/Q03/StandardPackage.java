
class StandardPackage extends Package{

    StandardPackage(String trackingNumber, double weight){
        super(trackingNumber, weight);
    }

    public double calculateCost(){
        return weight * 3.5;
    }
}