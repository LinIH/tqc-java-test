import java.util.*;

class Main{
	public static void main(String[] args){
		String filename = "system.log";
		List<String> list = new ArrayList<>();
		list.add("System started.");
		list.add("User login.");
		list.add("Error: Timeout.");
		LogManager.writeLog(filename, list);
    	System.out.println();
		LogManager.readLog(filename);
	}
}