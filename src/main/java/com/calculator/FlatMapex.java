package com.calculator;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FlatMapex {
	
	public static void main(String [] a) {
		List<Container> containers = Arrays.asList(
				new Container(10, Arrays.asList(new Item(1), new Item(2))),
				new Container(20, Arrays.asList(new Item(1), new Item(2))),
				new Container(30, Arrays.asList(new Item(1), new Item(2))),
				new Container(40, Arrays.asList(new Item(3), new Item(4))),
				new Container(50, Arrays.asList(new Item(4), new Item(5))));
		
		Map<Integer, List<Container>> maps = containers.stream()
	            .flatMap(container -> container.getItems().stream()
	                    .map(item -> new AbstractMap.SimpleEntry<>(item.getItemNo(), container))
	                    )
	            .collect(Collectors.groupingBy(
	                    Map.Entry::getKey,
	                    Collectors.mapping(Map.Entry::getValue, Collectors.toList())
	            ));
		
		Map<Integer, List<Item>> continarMap = containers.stream()
				.collect(Collectors.toMap(Container::getId, Container::getItems));
		
//		for (Map.Entry<Integer, List<Container>> entrys : maps.entrySet()) {
//	        System.out.println("ItemNo: " + entrys.getKey());
//	        System.out.println("Containers: " + entrys.getValue());
//	        System.out.println();
//	    }
		System.out.println(continarMap);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");

		List<Map.Entry<Integer, String>> entryList = new ArrayList<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
		    entryList.add(new AbstractMap.SimpleEntry<>(entry.getKey(), entry.getValue()));
		}

		// Printing the entries
		for (Map.Entry<Integer, String> entry : entryList) {
		    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
//		Supplier<T>
//		Function<T, R>
//		Predicate<T>
//		Consumer<T>
	}

	
	
	
	

}

class Container {
	@Override
	public int hashCode() {
		return Objects.hash(id, items);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		return id == other.id && Objects.equals(items, other.items);
	}

	private int id;
	private List<Item> items;

	public Container(int id, List<Item> items) {
		this.id = id;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public List<Item> getItems() {
		return items;
	}

	// Getters and setters...

	@Override
	public String toString() {
		return "Container{" + "id=" + id + ", items=" + items + '}';
	}
}

class Item {
	private int itemNo;

	public Item(int itemNo) {
		this.itemNo = itemNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(itemNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return itemNo == other.itemNo;
	}

	public int getItemNo() {
		return itemNo;
	}

	// Getters and setters...

	@Override
	public String toString() {
		return "Item{" + "itemNo=" + itemNo + '}';
	}
}
