import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] args){
		List<Employee> employees = Arrays.asList(
		    new Employee("Alice", "HR", 50000),
		    new Employee("Bob", "Engineering", 75000),
		    new Employee("Charlie", "Engineering", 80000),
		    new Employee("David", "HR", 60000),
		    new Employee("Eve", "Sales", 90000)
		);

		Map<String, List<Employee>> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		Map<String, Double> groupSalary = new HashMap<>();

		for(String key:group.keySet()){
			double avg = group.get(key).stream().mapToDouble(Employee::getSalary).average().orElse(0);
			groupSalary.put(key, avg);
		}

		System.out.println(groupSalary.toString());
	}

}