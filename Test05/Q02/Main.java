import java.util.*;

class Main{
    public static void main(String[] args){
        List<Shape> list = new ArrayList<>();
        list.add(new Circle(10));
        list.add(new Rectangle(10, 20));
        for(Shape s:list){
            if(s instanceof Circle){
                System.out.printf("Circle Area: ");
            }
            else if (s instanceof Rectangle){
                System.out.printf("Rectangle Area: ");
            }
            System.out.printf("%.2f\n", s.calculateArea());
            s.printInfo();
        }
    }
}