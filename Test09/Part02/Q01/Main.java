import java.util.*;

class Main{
	public static void main(String[] args){
		List<Employee> list = new ArrayList<>();
		list.add(new FullTimeEmployee("John Doe", 101, 50000));
		list.add(new PartTimeEmployee("Jane Smith", 102, 1200, 20));

		for(Employee e:list){
			e.display();
			System.out.printf("Salary: %.1f\n", e.calculateSalary());
		}
	}
}