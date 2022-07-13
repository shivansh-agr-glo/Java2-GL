package javacollections;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args) {
		//object to the queue
		Queue<String> names = new LinkedList<String>();
		
		//Adding elements to the queue
		names.add("Shivansh");
		names.add("Agrawal");
		names.add("Shahpura");
		names.add("Jaipur");
		names.add("Rajasthan");
		
		
		//print queue
		System.out.println("Elements of Queue : "+names);
		
		//remove 1st element
		System.out.println("Removed element is : "+names.remove());
		
		//Head element after removal
		System.out.println("Head element is: "+names.element());
		
		//remove head element of queue
		System.out.println("Poll(): "+names.poll());
		
		//Head element of Queue
		System.out.println("Peek(): "+names.peek());

	}

}
