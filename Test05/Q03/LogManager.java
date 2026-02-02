import java.io.*;
import java.util.*;

class LogManager{
    static void writeLog(String filename, List<String> messages){
    	System.out.println("Writing logs to system.log...");
    	try(
    		FileWriter fw = new FileWriter(filename);
    		){
    		for(String m:messages){
    			fw.write(m);
    			fw.write("\n");
    		}
    		System.out.println("Logs written successfully.");
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    }

    static void readLog(String filename){
    	System.out.println("Reading logs from system.log...");
    	try(
    		FileReader fr = new FileReader(filename)
    		){
    		int c;
    		while((c = fr.read()) != -1){
    			System.out.print((char)c);
    		}
    	}
    	catch(IOException e){
    		e.printStackTrace();
    	}
    }
}