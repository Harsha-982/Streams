package Streams;

import java.util.Optional;
import java.util.stream.Stream;

public class NoOfStreamOperations {
	public static void main(String[] args) {
//		creates an empty stream to return nothing instead of null
		
	Stream<Integer> intstream1=Stream.empty();
	
//				tocheck flow of this stream 
// 			stream actually reduces no of operations
	Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
	Stream<String> nameStartJ = nameStream.map(
	        (s) ->
	        {
	            System.out.println("Map: "+s);
	            return s.toUpperCase();
	 
	        })
	        .filter(
	        (s) ->
	        {
	             System.out.println("Filter: "+s);
	             return s.startsWith("J");
	        } 
	    );
	 
	Optional<String> findAny = nameStartJ.findAny();
	System.out.println("Final output: "+findAny.get());
	 

	}
}
