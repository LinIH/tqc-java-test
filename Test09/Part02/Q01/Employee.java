
abstract class Employee{
	protected String name;
	protected int id;

	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}

	public abstract double calculateSalary();

	public void display(){
		System.out.printf("Name: %s, ID: %s\n", this.name, this.id);
	}
}