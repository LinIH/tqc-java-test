
class SalaryWorker extends Employee{
	private double monthlySalary;

	SalaryWorker(String name, double monthlySalary){
		super(name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary(){
		return this.monthlySalary;
	}

}