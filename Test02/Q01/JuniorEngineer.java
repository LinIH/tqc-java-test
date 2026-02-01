
class JuniorEngineer extends Employee{

    JuniorEngineer(String id, String name, double baseSalary){
        super(id, name, baseSalary);
    }
    
    public long calculateTotalAnnualIncome(double performanceScore){
        return (long)((this.getBaseSalary() * 12) + (performanceScore * 10000));
    }
}