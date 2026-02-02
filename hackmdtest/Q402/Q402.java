import java.util.Scanner;
class Q402{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = -1;
        do{
            System.out.print("Input n(0 <= n <= 16):");
            n = cin.nextInt();
            if(n >= 0 && n <= 16){
                System.out.println(n + "的階乘(尾端遞迴))=" + iter(n));
                System.out.println(n + "的階乘(迴圈))=" + loop(n));
            }
        } while(n != 999);
    }

    public static int iter(int n){
        if(n ==0 || n == 1) return 1;
        return n * iter(n-1);
    }

    public static int loop(int n){
        int sum = 1;
        for(int i = 1; i <= n; i ++){
            sum *= i;
        }
        return sum;
    }
}