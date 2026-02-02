import java.util.*;
class TeacherDB{
    HashMap<String, Teacher> teachers = new HashMap<>();

    public void addTeacher(Teacher t){
        teachers.put(t.name, t);
    }

    public double totalOfAll(){
        int total = 0;
        for(Teacher t:teachers.values()){
            total += t.getAfterTaxIns();
        }
        return total;
    }

    public void printAll(){
        for(Teacher t:teachers.values()){
            try {
                if(t.getSalary() < 1500) throw new Exception("**" + t.name + " " + t.getSalary());
                else System.out.println(t.name + " " + t.getSalary());
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}