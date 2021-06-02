package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class LazyIntermediateOperators {

	public static void main(String[] args) {
//		
		Stream<String> nameStream = Stream.of("harsha","jahanavi","Anil","arun");
		Stream<String> nameStartJ = nameStream.map(String::toUpperCase)
		                                    .peek( e -> System.out.println(e))
		                                  .filter(s -> s.startsWith("J"));
		System.out.println("-----count the terminal opeation gets called-------");
		System.out.println(nameStartJ.count());
		
		
	}
}
