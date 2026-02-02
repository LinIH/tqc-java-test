
class SalaryWorker extends Employee{
    int yearPay;

    SalaryWorker(String id, int yearPay){
        super(id);
        this.yearPay = yearPay;
    }

    double monthPay(){
        return yearPay / 12;
    }
}