import java.util.*;
class Q202{
    public static void main(String[] args){
        System.out.println("Input:");
        Scanner cin = new Scanner(System.in);
        int min, max;
        for(int i = 0; i < 2; i++){
            try{
                check(cin.nextInt(), cin.nextInt());
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void check(int a, int b){
        if(a > b) System.out.println(a + " is larger than " + b);
        else if (a == b) System.out.println("two number are equal");
        else System.out.println(b + " is larger than " + a);
    }
}