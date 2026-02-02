import java.util.*;
class Q406{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = "";
        for(int i = 0; i < 2; i++){
            System.out.print("Innput a string:");
            s = cin.nextLine();
            System.out.println(s + " has " + iter(s) + "As");
        }
    }
    
    public static int iter(String s){
        if("".equals(s)) return 0;
        else{
            if(s.charAt(0) == 'A') return 1 + iter(s.substring(1));
            else return iter(s.substring(1));
        }
    }
}