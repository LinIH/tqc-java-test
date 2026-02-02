
// Main.java (for testing)
public class Main {
    public static void main(String[] args) {
        Employee manager = new SalaryWorker("John Doe", 60000);
        Employee partTimer = new HourlyWorker("Jane Smith", 200, 80);

        // 利用多型
        Employee[] employees = {manager, partTimer};

        for (Employee emp : employees) {
            System.out.printf("Employee: %s, Salary: %.2f%n", emp.name, emp.calculateSalary());
        }
    }
}
// 預期輸出:
// Employee: John Doe, Salary: 60000.00
// Employee: Jane Smith, Salary: 16000.00