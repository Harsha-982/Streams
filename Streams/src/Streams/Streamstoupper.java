package Streams;

import java.util.*;
import java.util.stream.*;
public class Streamstoupper {
	public static void main(String...args) {
		List<String> letters=List.of("a","b","c","d","e");
		List<String> uppercaseletters =ConverttoUpperCase(letters);
		
		System.out.println(uppercaseletters);
	}

	private static List<String> ConverttoUpperCase(List<String> letters) {
		return letters.stream()
				.map(n->n.toUpperCase())
				.collect(Collectors.toList());
	}
}
