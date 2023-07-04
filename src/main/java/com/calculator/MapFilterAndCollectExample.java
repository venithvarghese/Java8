package com.calculator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilterAndCollectExample {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        map.put(5, "Elderberry");
        
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> filteredValues = map.entrySet()
                .stream()
                .filter((k) -> k.getValue().startsWith("B")) // Filter condition: Starts with "B"
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(filteredValues); // Output: [Banana]
        
        List<Integer> sublist = num.stream()
                .skip(3)
                .limit(5)
                .collect(Collectors.toList());

        for (Integer value : sublist) {
            System.out.println(value);
        }
        
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Durian", "Fig", "Grape");

        List<String> filteredAndSorted = fruits.stream()
                .filter(fruit -> fruit.length() <= 5) // Filter strings with length less than or equal to 5
                .sorted(Comparator.comparing(String::length)) // Sort the filtered strings by length
                .collect(Collectors.toList());

        for (String fruit : filteredAndSorted) {
            System.out.println(fruit);
        }
        List<String> sentences = Arrays.asList("Hello, world!", "Java is awesome", "Streams are powerful");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
//        Thread t = new Thread();
    }
    
}
