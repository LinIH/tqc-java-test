
abstract class Employee{
    String id;
    static int count;
    static double sum;

    Employee(String id){
        this.id = id;
        this.count ++;
    }
    
    abstract double monthPay();

    String whichHigh(Employee e){
        return this.monthPay() > e.monthPay() ? this.id : e.id;
    }

    double monthTaxed(){
        sum += monthPay() * 0.15;
        return monthPay() * 0.15 ;
    }

    double getAverageTax(){
        return sum / count;
    }

}