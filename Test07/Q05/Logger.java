import java.io.IOException;
import java.time.*;
import java.time.format.*;
import java.nio.file.*;

class Logger{
	private Path path;
	Logger(Path path){
		this.path = path;
	}
	public void log(String message) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String msg = String.format("[%s] - %s\n", now.format(formatter), message);

		Files.writeString(path, msg, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
	}
}