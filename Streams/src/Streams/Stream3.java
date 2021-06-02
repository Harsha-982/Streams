package Streams;

import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class Stream3 {

	public static void main(String[] args) {
		//taking a part of array of elements
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart =Arrays.stream(arr,1,3);
		streamOfArrayPart.forEach(System.out::println);
		
		
	}

}

