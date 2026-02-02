
class HourlyWorker extends Employee{
    int hourPay;
    int hour;

    HourlyWorker(String id, int hourPay, int hour){
        super(id);
        this.hourPay = hourPay;
        this.hour = hour;
    }

    double monthPay(){
        return hourPay * hour;
    }
}