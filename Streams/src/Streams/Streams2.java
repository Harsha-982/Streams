package Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.Iterator;

public class Streams2 {
	
	public static void main(String[] args) {

		Set<String> set1=Set.of("Harsha","Usha","Munni","Simhaksh","Hanvitha"); 
//		System.out.println(set1);
		Stream<Integer> strea=Stream.of(1,2,3,4,5,6);
//		IntStream.iterate(2,x->x<100,x->x*x).forEach(System.out::println);
		
		List<Integer> listofnum=List.of(1,2,3,4,5,8,2,9,10,6,8,0);
		//from above list take get even numbers whose value must be less than 7
		//we generally do this 
//		for(int number:listofnum) {
//			if(number<7 & number%2==0) {
//				System.out.println(number);
//			}
//		}
//		
		// we can get the same piece of code output by below line
//		listofnum.stream().dropWhile(x->x>7).dropWhile(y->y%2==0).forEach(System.out::println);
		
		
//		strea.forEach(System.out::println);
//		strea.forEach(System.out::println); // this produces an error IllegalStateException
		
		Stream.iterate(2,n->n+2).limit(10)
        .forEach(x -> System.out.println(x));

	}

}












