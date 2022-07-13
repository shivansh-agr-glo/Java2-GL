package javacollection_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	public static void main(String[] args) {
		ArrayList<String> collections=new ArrayList<String>();
		
		collections.add("Shiva");
		collections.add("Agrawal");
		collections.add("Shahpura");
		collections.add("Jaipur");
		collections.add("Rajasthan");
		collections.add("India");
		
		Iterator<String> iter=collections.iterator();
		
		//increment/decrement using iter object
		while(iter.hasNext()){
			
			String object= iter.next();
			System.out.println(object);
			
		}
		

	}

}
