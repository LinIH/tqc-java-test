import java.util.*;

class Main_Q2{
	public static void main(String[] args){
		List<Publication> ps = new ArrayList<>();
		ps.add(new Book("978-0-321-35668-0", "Effective Java", "Joshua Bloch"));
		ps.add(new Magazine("977-1-234-56700-1", "National Geographic", "National Geographic Society", "2023-Feb"));

		for(Publication p:ps){
			p.displayInfo();
		}
	}
}