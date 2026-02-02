
class OversizePackage extends StandardPackage{
    int overweightfee;

    OversizePackage(String trackingNumber, double weight){
        super(trackingNumber, weight);
    }

    public double calculateCost(){
        double standardfee = super.calculateCost();
        return this.weight > 20 ? standardfee * 1.5 : standardfee;
    }
}