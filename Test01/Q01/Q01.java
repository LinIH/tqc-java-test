import java.util.*;
import java.io.*;
class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter your height (meters):");
            double height = sc.nextDouble();
            System.out.print("Please enter your weight (kilograms):");
            double weight = sc.nextDouble();
            if(height <= 0 || weight <= 0) throw new IOException("Invalid Input");
            System.out.println(calculateAndRateBMI(height, weight));
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static String calculateAndRateBMI(double height, double weight){
        double bmi = weight / height / height;
        String msg = String.format("Your BMI is %.2f, rating:", bmi);
        if(bmi < 18.5) msg += "Underweight";
        else if (bmi < 24) msg += "Normal";
        else msg += "Overweight";

        return msg;
    } 
}