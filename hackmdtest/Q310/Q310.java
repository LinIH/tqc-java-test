import java.util.*;
class Q310{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n = -1;
        do{
            System.out.print("請輸入n的值(n>0，且為偶數):");
            try{
                n = cin.nextInt();  
            } catch(Exception e){ 
                cin.next();
                n = -1;
                continue;
            }
        } while(!((n%2 == 0) && (n > 0)));
        
        System.out.print("2");
        if(n > 2){
            System.out.print("+4");
        }
        if(n > 6){
            System.out.print("+...");
        }
        if(n > 4){
            System.out.print("+" + n);
        }
        System.out.print("=" + (2+n)*n/2/2);
    }
}