import java.util.*;

class Course implements Enrollable{
	private String courseName;
	private int capacity;
	private List<String> students = new ArrayList<>();

	Course(String courseName, int capacity){
		this.courseName = courseName;
		this.capacity = capacity;
	}

	public void enrollStudent(String s)  throws EnrollmentFullException{
		if(getEnrolledCount() >= capacity){
			throw new EnrollmentFullException(getEnrolledCount());
		}
		else{
			this.students.add(s);
			System.out.printf("Student %s has enrolled in [%s].\n", s, this.courseName);
		}
	}

	public int getEnrolledCount(){
		return this.students.size();
	}
}