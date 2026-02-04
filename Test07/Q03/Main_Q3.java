
class Main_Q3{
	public static void main(String[] args){
		Course c = new Course("Math", 2);
		try{
			c.enrollStudent("Alice");
			c.enrollStudent("Bob");
			c.enrollStudent("Mary");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}