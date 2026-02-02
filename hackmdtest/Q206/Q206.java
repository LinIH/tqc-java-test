import java.util.*;
class Q206{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String[] myClass = {"Chinese", "English", "Math"};
        double[] myScore = new double[myClass.length];
        for(int i = 0; i < myClass.length; i++){
            myScore[i] = 0;
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < myClass.length; j++){
                try{
                    System.out.print("Input " + myClass[j] + " score:");
                    myScore[j] = cin.nextInt();
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.print(checkPass(myClass, myScore));
        }
    }

    public static String checkPass(String[] myClass, double[] myScore){
        String msg = "";
        for(int i = 0; i < myClass.length; i ++){
            if(myScore[i] < 60) msg += myClass[i] + " failed.\n";
        }

        return "".equals(msg) ? "All pass.\n" : msg;
    }
}