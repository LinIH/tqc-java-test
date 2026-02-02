import java.util.*;
class Management{
    HashMap<String, Employee> management = new HashMap<>();

    void putEmployee(Employee e){
        management.put(e.id, e);
    }

    double afterTax(String id){
        return management.get(id).monthPay() - management.get(id).monthTaxed();
    }

    void printAll(){
        int totalMonthSalary = 0;
        for(Employee e:management.values()){
            try {
                totalMonthSalary += e.monthPay();
                System.out.println(totalMonthSalary);
                if(totalMonthSalary > 50000) throw new Exception("Total salary exceed limit:" + totalMonthSalary);
            } catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}