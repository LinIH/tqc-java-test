
class HourlyWorker extends Employee{
	private double hourlyRate;
	private int hoursWorked;

	HourlyWorker(String name, double hourlyRate, int hoursWorked){
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculateSalary(){
		return this.hourlyRate * this.hoursWorked;
	}
}