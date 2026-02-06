## ~~~

### import
``` java
import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.time.*;
import java.time.format.*;
import java.nio.file.*;
```

### time & time-format
``` java
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String msg = String.format("[%s] - %s\n", now.format(formatter), message);
```

### sealed / non-sealed / permits
``` java
sealed interface Payment permits CreditCard, Cash{
    public default String getName(){
        return this.getClass().getSimpleName();
    }
}
```

### record
``` java
record CreditCard(String cardNumber, double amount) implements Payment{

} //auto-generate getter, toString(), equals()...
```

## java io

### 讀檔Read
``` java
try(
	FileReader fr = new FileReader("books.txt");
	BufferedReader br = new BufferedReader(fr);
	){

	String line = "";
	while((line = br.readLine()) != null){
		String[] data = line.split(",");
		bookList.add(new Book(data[0], data[1], Integer.valueOf(data[2]), Double.valueOf(data[3]), Integer.valueOf(data[4]), data[5]));
	}
} catch(IOException e){
	e.printStackTrace();
}
```

### 寫檔Write
``` java
try(
	FileWriter fw = new FileWriter("new_books.txt");
	BufferedWriter bw = new BufferedWriter(fw);
	){
	bw.write(s);
} catch(IOException e){
	e.printStackTrace();
}
```

## stream api

###  過濾、排序(custom)、foreach
``` java
bookList.stream()
		.filter(x -> x.getPrice() > 700)
		.sorted(Comparator.comparingDouble(Book::getPrice).reversed())
		.forEach(x -> System.out.println(x.toString()));
```

### 平均
``` java
double avg = bookList.stream()
		.mapToDouble(Book::getPrice)
		.average()
		.orElse(0);
```

### String join
``` java
String s = String.join(",", bookList.stream()
		.filter(x -> x.getPublicationYear() >= 2020)
		.map(Book::getTitle)
		.collect(Collectors.toList()));
```

### 分組
``` java
Map<String, List<Employee>> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
```

### 扁平化flatMap
``` java
Map<String, List<OrderItem>> orderItemGroup = orders.stream()
	.flatMap(o -> o.getItems().stream())
	.collect(Collectors.groupingBy(OrderItem::getBookTitle));	//分組
```

### 找最大max
``` java
Map<String, Integer> orderItemQuantity = new HashMap<>();
String maxKey = orderItemQuantity.entrySet().stream()
	.max(Map.Entry.comparingByValue())
	.map(Map.Entry::getKey)
	.orElse("");
```

## Map

### keySet()
``` java
Map<String, List<Employee>> group = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
Map<String, Double> groupSalary = new HashMap<>();
for(String key:group.keySet()){
	double avg = group.get(key).stream().mapToDouble(Employee::getSalary).average().orElse(0);
	groupSalary.put(key, avg);
}
```

### entrySet()
``` java
Map<String, Integer> orderItemQuantity = new HashMap<>();
String maxKey = orderItemQuantity.entrySet().stream()
	.max(Map.Entry.comparingByValue())
	.map(Map.Entry::getKey)
	.orElse("");
```


## nio

### ???
``` java
import java.nio.file.*;
/** **/
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
/** Logger **/
Files.writeString(path, msg, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
```