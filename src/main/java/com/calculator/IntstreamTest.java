package com.calculator;

import java.util.stream.IntStream;

public class IntstreamTest {
	
	public static void main(String a[]) {
		IntStream.range(0, 10).filter(i -> i%2 == 0).forEach(x ->System.out.println(x));
		IntStream.range(1, 10).filter(i -> i%2 == 0).forEach(System.out::println);
	}

}
