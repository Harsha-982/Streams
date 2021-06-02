package Streams;

import java.util.stream.*;

public class PrimitiveStreams {

	public static void main(String[] args) {
		Stream.of("10","20","30")
		.mapToInt(Integer::parseInt)
		.average()
		.ifPresent(System.out::println);
		
		System.out.println("-------converting from intstream to stream--------");
		
		IntStream.of(10,20,30)
				.mapToObj(i->""+i)
				.forEach(y->System.out.println(y));
		
	}

}
