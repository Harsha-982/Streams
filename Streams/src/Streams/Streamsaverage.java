package Streams;


import java.util.ArrayList;
import java.util.List;

public class Streamsaverage {
	public static void main(String... args) {
		List<Integer> numbers=List.of(1,2,3,45,6,7);
		Double result=averageOfNums(numbers);
		System.out.println(result);
	}
	

	private static Double averageOfNums(List<Integer> numbers) {
		
		return numbers.stream()
//			mapToInt maps any type to Int
				.mapToInt(n->n)
//			average takes only Premitive stream		
				.average()
// 			the final output converts into Double by getAsDouble  
				.getAsDouble();
		
	}
}