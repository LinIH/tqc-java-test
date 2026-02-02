import java.util.*;
class Q308{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int fee = 0, fees = 0;
        do{
            fees += fee;
            System.out.print("請輸入消費金額，或輸入-1結束：");
            fee = cin.nextInt();
        } while(fee != -1);
        System.out.println("電腦周邊總消費：" + fees);
    }
}