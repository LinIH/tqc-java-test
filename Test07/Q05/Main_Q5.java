import java.nio.file.*;

class Main_Q5{
	public static void main(String[] args){
		try{
			Path path = Paths.get("app.log");
			if(Files.exists(path)) Files.delete(path);
			Logger logger1 = new Logger(path);
			logger1.log("Application starting...");
			logger1.log("Processing data...");
			logger1.log("Application finished.");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}