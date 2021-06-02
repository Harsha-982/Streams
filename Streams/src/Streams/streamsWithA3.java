package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class streamsWithA3 {
	public static void main(String...args) {
		List<String> listWithConditions=List.of("abc","abb","cdf");
		search(listWithConditions);
		
	}

	public static List<String> search(List<String> listWithCondition) {
		return listWithCondition.stream()
		  .filter(s -> s.startsWith("a"))
		  .filter(s -> s.length() == 3)
		  .collect(Collectors.toList());
		 } 
}
