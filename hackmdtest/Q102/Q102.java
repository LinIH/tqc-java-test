import java.util.*;
class Q102{
    public static void main(String[] args){
        try {
            Scanner cin = new Scanner(System.in);
            System.out.print("Please input:");
            double kgs = cin.nextDouble();
            System.out.printf("%.6f kg = %.6f ponds", kgs, kgs * 2.20462);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}