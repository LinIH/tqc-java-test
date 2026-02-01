import java.util.*;
import java.io.*;
class Q01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        JuniorEngineer j = new JuniorEngineer("J001", "John", 10000);
        SeniorEngineer s = new SeniorEngineer("S001", "Mary", 20000);
        double performanceScoreP;
        double performanceScoreS;
        double incomeP;
        double incomeS;
        try {
            System.out.print("Enter performance score for Junior Engineer: ");
            performanceScoreP = sc.nextDouble();
            check(performanceScoreP);
            System.out.print("Enter performance score for Senior Engineer: ");
            performanceScoreS = sc.nextDouble();
            check(performanceScoreS);
            incomeP = (double)j.calculateTotalAnnualIncome(performanceScoreP) - j.calculateBaseTax() * 12;
            incomeS = (double)s.calculateTotalAnnualIncome(performanceScoreS) - s.calculateBaseTax() * 12;
            System.out.printf("Junior Engineer (%s) After-Tax Annual Income: %.2f\n", j.getId(), incomeP);
            System.out.printf("Senior Engineer (%s) After-Tax Annual Income: %.2f\n", s.getId(), incomeS);
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("error");
        }
    }
    public static void check(double performanceScore) throws IllegalArgumentException{
        if(performanceScore > 5 || performanceScore < 0) throw new IllegalArgumentException("Invalid Input");
    }
}