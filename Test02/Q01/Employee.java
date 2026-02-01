
abstract class Employee{
    private String id;
    private String name;
    private double baseSalary;

    Employee(String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateBaseTax(){
        return baseSalary * 0.05;
    }

    public abstract long calculateTotalAnnualIncome(double performanceScore);

    public String getId(){
        return this.id;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }
}