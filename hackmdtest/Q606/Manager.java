
class Manager extends FullTime{
    int rank;

    Manager(String name, int rate, int totalHours, int rank){
        super(name, rate, totalHours);
        this.rank = rank;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + rank * 500;
    }
}