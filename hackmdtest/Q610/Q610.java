import java.util.*;
class Q610{
    static ArrayList<Employee> employees = new ArrayList<>();
    static Management management = new Management();
    public static void main(String[] args){
        init_data();
        Q610_1();
        Q610_2();
        Q610_3();
        Q610_4();
        Q610_5();
    }

    public static void Q610_5(){
        management.printAll();
    }

    public static void Q610_4(){
        String query_id = "97001";
        System.out.println(query_id + "的稅後薪資:" + management.afterTax(query_id));
    }

    public static void Q610_3(){
        System.out.println("平均稅額:" + employees.get(0).getAverageTax());
    }

    public static void Q610_2(){
        System.out.println(employees.get(0).whichHigh(employees.get(1)) + "較高");
        System.out.println(employees.get(1).whichHigh(employees.get(2)) + "較高");

        for(Employee e:employees){
            System.out.println(e.getClass().getName() + "稅額:" + e.monthTaxed());
        }
    }

    public static void Q610_1(){
        for(Employee e:employees){
            System.out.println(e.getClass().getName() + ":" + e.monthPay());
        }
    }

    public static void init_data(){
        employees.add(new SalaryWorker("96001", 180000));
        employees.add(new HourlyWorker("96002", 160, 100));
        employees.add(new Manager("97001", 240000, 5000));
        for(Employee e:employees){
            management.putEmployee(e);
        }
    }
}