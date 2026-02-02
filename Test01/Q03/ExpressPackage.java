
class ExpressPackage extends StandardPackage{
    final int fee = 12;

    ExpressPackage(String trackingNumber, double weight){
        super(trackingNumber, weight);
    }

    public double calculateCost(){
        return super.calculateCost() + fee;
    }
}