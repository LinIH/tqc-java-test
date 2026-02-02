
class Q108{
    public static void main(String[] args){
        int a = add(2, 3);
        double b = add(5.2, 4.3);
        String c = add("I love ", "Java!!");
        System.out.printf("%d %.6f %s", a, b, c);
    }

    public static int add(int a, int b){
        System.out.println("Adding two integers:" + a + "," + b);
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("Adding two doubles:" + a + "," + b);
        return a + b;
    }

    public static String add(String a, String b){
        System.out.println("Adding two strings:" + a + "," + b);
        return a + b;
    }
}