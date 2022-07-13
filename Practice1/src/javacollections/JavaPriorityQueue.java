package javacollections;

import java.util.PriorityQueue;

public class JavaPriorityQueue {

	public static void main(String[] args) {

		PriorityQueue<String> names=new PriorityQueue<String>();
		names.add("Shivansh");
		names.add("Agrawal");
		names.add("Shahpura");
		names.add("Jaipur");
		names.add("Rajasthan");
		names.add("shivansh");
		names.add("agrawal");
		names.add("shahpura");
		names.add("jaipur");
		names.add("rajasthan");
		
		System.out.println("Queue : "+names);

		

	}

}
