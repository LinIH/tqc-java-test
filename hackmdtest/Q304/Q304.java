import java.util.*;
class Q304{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        double fee = 0, fees = 0;
        int people = 0;
        while(true){
            System.out.print("Please enter meal dollars or enter -1 to stop:");
            fee = cin.nextInt();
            if(fee == -1) break;
            fees += fee;
            people ++;
        }
        double avg = (people == 0) ? 0 : (double) fees / people;
        System.out.printf("餐點總費用：%.2f\n%d道餐點平均費用為：%.2f", fees, people, avg);
    }
}