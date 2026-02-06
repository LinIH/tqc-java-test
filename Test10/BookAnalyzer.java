import java.io.*;
import java.util.*;
import java.util.stream.*;

class BookAnalyzer{
	public static void main(String[] args){
		List<Book> bookList = new ArrayList<>();
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
		} catch(Exception e){
			e.printStackTrace();
		}
		

		// a
		System.out.println("高價電腦科學書籍 (依價格降序):");
		bookList.stream()
				.filter(x -> x.getPrice() > 700)
				.sorted(Comparator.comparingDouble(Book::getPrice).reversed())
				.forEach(x -> System.out.println(x.toString()));

		// b
		double avg = bookList.stream()
				.mapToDouble(Book::getPrice)
				.average()
				.orElse(0);
		System.out.printf("平均書籍價格: %.2f\n", avg);

		// c
		String s = String.join(",", bookList.stream()
				.filter(x -> x.getPublicationYear() >= 2020)
				.map(Book::getTitle)
				.collect(Collectors.toList()));

		try(
			FileWriter fw = new FileWriter("new_books.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			){
			bw.write(s);
		} catch(IOException e){
			e.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}


	}
}