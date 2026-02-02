
abstract class Teacher{
    String name;
    int rate;
    int totalHours;

    Teacher(String name, int rate, int totalHours){
        this.name = name;
        this.rate = rate;
        this.totalHours = totalHours;
    }

    public abstract double getSalary();
    public abstract void printSalary();
    public abstract double getAfterTaxIns();

    public String compare(Teacher t){
        if(this.getSalary() > t.getSalary()) return this.name + " is higher than " + t.name;
        else return t.name + " is higher than " + this.name;
    }
}