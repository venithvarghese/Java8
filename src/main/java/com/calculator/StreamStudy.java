package com.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamStudy {
	
	public static void main(String a[]) {
		Stream.iterate(1, n -> n + 1).limit(10).filter(x-> x%2 == 0).forEach(System.out::println);
		Stream.iterate(new int[] {
                0,1
            }, t -> new int[] {
                t[1], t[0] + t[1]
            })
            .limit(10)
            .map(n -> n[0])
            .forEach(System.out::println);
		int [] arr= new int [] {3,5,6,4,1,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		String[][] twoDArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
		// Gives undesired output:
//		System.out.println(Arrays.toString(deepArray));
		List<String> twoDarr = Arrays.stream(twoDArray).flatMap(Arrays::stream).collect(Collectors.toList());
		// Gives the desired output:
		System.out.println(twoDarr);
		
	}
	
	
	

}
