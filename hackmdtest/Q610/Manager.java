
class Manager extends SalaryWorker{
    int bonus;

    Manager(String id, int yearPay, int bonus){
        super(id, yearPay);
        this.bonus = bonus;
    }

    double monthPay(){
        return super.monthPay() + bonus;
    }
}