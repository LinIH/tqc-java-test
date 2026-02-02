import java.util.*;
import java.io.*;
class Q01{
    public static void main(String[] args){
        JuniorEngineer j = new JuniorEngineer("J001", "John", 20000);
        SeniorEngineer s = new SeniorEngineer("S001","Mary", 40000);
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter performance score for Junior Engineer: ");
            double jscore = sc.nextDouble();
            System.out.print("Enter performance score for Senior Engineer: ");
            double sscroe = sc.nextDouble();
            if(jscore <0 || jscore > 5 || sscroe < 0 || sscroe > 5){
                throw new Exception("Invalid Input");
            }
            System.out.printf("Junior Engineer (%s) After-Tax Annual Income: %.2f\n", j.getId(), (double)j.calculateTotalAnnualIncome(jscore) - j.calculateBaseTax() * 12);
            System.out.printf("Senior Engineer (%s) After-Tax Annual Income: %.2f\n", s.getId(), (double)s.calculateTotalAnnualIncome(jscore) - s.calculateBaseTax() * 12);
        } catch (IOException e){
            System.out.print("Invalid Input");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}