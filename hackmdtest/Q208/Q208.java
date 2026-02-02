import java.util.*;
class Q208{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double score = 0;
        String msg = "Your grade is ";
        for(int i = 0; i < 5; i++){
            System.out.println("Input:");
            score = cin.nextInt();
            if(score >= 90) System.out.println(msg + "A");
            else if(score >= 80) System.out.println(msg + "B");
            else if(score >= 70) System.out.println(msg + "C");
            else if(score >= 60) System.out.println(msg + "D");
            else System.out.println(msg + "F");
        }
    }
}