
class SeniorEngineer extends Employee{
    SeniorEngineer(String id, String name, double baseSalary){
        super(id, name, baseSalary);
    }

    public long calculateTotalAnnualIncome(double performanceScore){
        return (long)((this.getBaseSalary() * 12) + (this.getBaseSalary() * performanceScore) + 50000);
    }
}