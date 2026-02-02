
class FullTime extends Teacher{

    FullTime(String name, int rate, int totalHours){
        super(name, rate, totalHours);
    }
    
    public double getSalary(){
        return (double)(9 * rate + (totalHours - 9) * rate * 0.8);
    }

    public void printSalary(){
        System.out.printf("%s-FullTime%.1f\n", name, getSalary());
    }

    public double getAfterTaxIns(){
        return getSalary() * 0.9 - 100;
    }
}