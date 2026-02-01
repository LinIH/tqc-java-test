import java.util.List;

public class MainProcessor {
    public static void main(String[] args){
        Student s1 = new Student("001", "S1Name", 100);
        Student s2 = new Student("002", "S2Name", 50);
        Student s3 = new Student("003", "S3Name", 65);
        Student s4 = new Student("004", "S4Name", 77);
        Student s5 = new Student("005", "S5Name", 41);
        List<Student> students = List.of(s1, s2, s3, s4, s5);
        GradeAnalyzer.analyze(students);
    }
}
