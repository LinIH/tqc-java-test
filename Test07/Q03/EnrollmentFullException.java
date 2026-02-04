
class EnrollmentFullException extends Exception{
	EnrollmentFullException(int capacity){
		super("Error: Course is full!\nCurrent enrollment: " + capacity);
	}
}