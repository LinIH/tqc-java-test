import java.util.Scanner;
class Q408{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = "";
        for(int i = 0; i < 2; i++){
            System.out.print("Input a string:");
            s = cin.nextLine();
            System.out.println(rev(s));
        }
    }

    public static String rev(String s){
        if("".equals(s)) return "";
        else return rev(s.substring(1)) + s.charAt(0);
    }
}