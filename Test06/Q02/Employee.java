
abstract class Employee{
	protected String name;

	Employee(String name){
		this.name = name;
	}

	abstract public double calculateSalary();
}