package Streams;

import java.util.PriorityQueue;
import java.util.Queue;

public class Strems1 {
	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		Object s=queue.peek();
		System.out.println(s);
		
		queue.add("harsha");
		queue.add("usha");
		queue.add("padma");
		queue.add("subbarao");
		System.out.println(queue);
		queue.remove();  // harsha
		queue.remove();	 //padma
//		queue.remove();		//subbarao
		System.out.println(queue);
		Object peek=queue.peek();
		System.out.println(peek);
		
		//-------prints stream of values-------
		queue.stream().forEachOrdered(System.out::println);
	}
}
