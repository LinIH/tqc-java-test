import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] args){
		List<Order> orders = Arrays.asList(
		    new Order(Arrays.asList(
		        new OrderItem("Effective Java", 2),
		        new OrderItem("Java Concurrency in Practice", 1)
		    )),
		    new Order(Arrays.asList(
		        new OrderItem("Clean Code", 3),
		        new OrderItem("Effective Java", 1)
		    )),
		    new Order(Arrays.asList(
		        new OrderItem("Head First Design Patterns", 2),
		        new OrderItem("Clean Code", 1)
		    ))
		);

		Map<String, List<OrderItem>> orderItemGroup = orders.stream()
			.flatMap(o -> o.getItems().stream())
			.collect(Collectors.groupingBy(OrderItem::getBookTitle));

		Map<String, Integer> orderItemQuantity = new HashMap<>();

		for(String key:orderItemGroup.keySet()){
			int q = orderItemGroup.get(key).stream().mapToInt(OrderItem::getQuantity).sum();
			orderItemQuantity.put(key, q);
		}

		String maxKey = orderItemQuantity.entrySet().stream()
			.max(Map.Entry.comparingByValue())
			.map(Map.Entry::getKey)
			.orElse("");


		System.out.println(maxKey + ":" + orderItemQuantity.get(maxKey));
	}

}