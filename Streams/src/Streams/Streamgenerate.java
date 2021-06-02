package Streams;

import java.util.stream.*;

public class Streamgenerate {
	public static void main(String[] args) {
		
		Stream<Integer> intStream=Stream
				.generate(() ->(int)(Math.random()*10))
				.limit(5);
		intStream.forEach(System.out::println);
	}
	
}
