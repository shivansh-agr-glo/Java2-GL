package javacollections;

import java.util.Deque;
import java.util.LinkedList;

public class JavaDequeue {

	public static void main(String[] args) {
		Deque<String> names=new LinkedList<String>();
		names.add("Shivansh");
		names.add("Agrawal");
		names.add("Shahpura");
		names.add("Jaipur");
		names.add("Rajasthan");
		
		//Print Dqueue
		System.out.println("Queue : "+names);
		
		//Add first
		names.addFirst("Hi");
		System.out.println("Queue after adding first : "+names);
		
		//add last
		names.addLast("Bye");
		System.out.println("Queue after adding Last : "+names);
		
		//Contains
		System.out.println("Dque contains 'Shivansh'? : "+names.contains("Shivansh"));
		
		//getfirst
		System.out.println("Get First: "+names.getFirst());
		
		//getlast
		System.out.println("Get Last: "+names.getLast());
		
		//Head element
		System.out.println("PeekFirst(): "+names.peekFirst());
		
		//Tail element
		System.out.println("PeekLast(): "+names.peekLast());
		
		//PollFirst
		System.out.println("Poll(): "+names.pollFirst());
		
		//PollLast
		System.out.println("Poll(): "+names.pollLast());
		
		//Size
		System.out.println("Size: "+names.size());
		
		//Print Dqueue
		System.out.println("Queue : "+names);
		

	}

}
