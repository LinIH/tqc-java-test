import java.util.*;
import java.io.*;
class Q02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter base:");
            int base = sc.nextInt();
            System.out.print("Please enter exponent:");
            int exp = sc.nextInt();
            if(exp < 0) throw new IOException("Invalid Input");
            System.out.printf("Calculated using loop (%d^%d) = %d\n", base, exp, powerLoop(base, exp));
            System.out.printf("Calculated using recursion (%d^%d) = %d\n", base, exp, powerRecursive(base, exp));
        } catch (IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Invalid Input");
        }
    }

    public static int powerLoop(int base, int exp){
        int power = 1;
        for(int i = 0; i < exp; i++){
            power *= base;
        }
        return power;
    }

    public static int powerRecursive(int base, int exp){
        if(exp == 0) return 1;
        return base * powerRecursive(base, exp - 1);
    }

}