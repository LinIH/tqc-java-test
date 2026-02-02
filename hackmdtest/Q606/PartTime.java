
class PartTime extends Teacher{

    PartTime(String name, int rate, int totalHours){
        super(name, rate, totalHours);
    }
    
    public double getSalary(){
        return (double)totalHours * rate;
    }

    public void printSalary(){
        System.out.printf("%s-PartTime%.1f\n", name, getSalary());
    }
    
    public double getAfterTaxIns(){
        return getSalary() * 0.9 - 100;
    }
}