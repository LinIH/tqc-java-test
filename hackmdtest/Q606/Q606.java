import java.util.*;
import java.io.*;

class Q606{
    static ArrayList<Teacher> arr = new ArrayList<>();

    public static void main(String[] args){
        init_data();
        Q606_1();
        Q606_2();
        Q606_3();
        Q606_4();
        Q606_5();
    }

    public static void Q606_5(){
        TeacherDB tDb = new TeacherDB();
        for(Teacher teacher:arr){
            tDb.addTeacher(teacher);
        }
        tDb.printAll();
    }

    public static void Q606_4(){
        TeacherDB tDb = new TeacherDB();
        for(Teacher teacher:arr){
            tDb.addTeacher(teacher);
        }
        System.out.printf("Total salary: %.1f\n", tDb.totalOfAll());
    }

    public static void Q606_3(){
        System.out.println(arr.get(5).compare(arr.get(4)));
        System.out.println(arr.get(4).compare(arr.get(0)));
    }

    public static void Q606_2(){
        for(Teacher t:arr){
            System.out.printf("%s-afterTaxIns:%.1f\n", t.name, t.getAfterTaxIns());
        }
    }

    public static void Q606_1(){
        for(Teacher t:arr){
            System.out.printf("%s-%s:%.1f\n",t.name, t.getClass(), t.getSalary());
        }
    }

    public static void init_data(){
        arr.add(new PartTime("John", 400, 2));
        arr.add(new PartTime("Mary", 300, 4));
        arr.add(new FullTime("Peter", 400, 9));
        arr.add(new FullTime("Paul", 300, 12));
        arr.add(new FullTime("Eric", 350, 15));
        arr.add(new Manager("Fang", 500, 12, 3));
    }
}