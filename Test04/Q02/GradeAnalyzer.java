import java.util.*;
import java.util.stream.Collectors;

class GradeAnalyzer{
    public static void analyze(List<Student> students){
        double avgScore = students.stream().mapToInt(Student::score).average().orElse(0.0);
        System.out.printf("Average Score: %.1f\n", avgScore);
        //List<String> failedStudent = students.stream().filter(a -> a.score() < 60).map(Student::name).collect(Collectors.toList());
        List<String> failedStudent = students.stream().filter(a -> a.score() < 60).map(x -> x.name()).collect(Collectors.toList());
        System.out.println("Failed Students: [" + String.join(",", failedStudent) + "]");
        Student topStudent = students.stream().max(Comparator.comparing(Student::score)).orElse(new Student("","",0));
        System.out.printf("Top Student: %s\n", topStudent.toString());
    }
}