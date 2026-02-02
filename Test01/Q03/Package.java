
abstract class Package{
    protected String trackingNumber;
    protected double weight;

    Package(String trackingNumber, double weight){
        this.trackingNumber = trackingNumber;
        this.weight = weight;
    }

    public abstract double calculateCost();
}