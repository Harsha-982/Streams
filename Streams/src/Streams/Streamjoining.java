package Streams;

import java.util.Set;
import java.util.stream.*;

public class Streamjoining {

	public static void main(String[] args) {
		Set<Integer> sets=Set.of(1,2,3,4,5,6);
		System.out.println(getString(sets));
	}
	
//---------------joining method joins all and retruns a string ----------
	
	public static String getString(Set<Integer> sets) {
		return sets.stream()
			  .map(i->i%2==0?"e"+i:"o"+i)
			  .collect(Collectors.joining(","));
	}
}
