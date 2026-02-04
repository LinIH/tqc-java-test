
interface Enrollable{
	void enrollStudent(String studentName) throws EnrollmentFullException;
	int getEnrolledCount();
}