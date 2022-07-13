package javacollection_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterationOverList {

	public static void main(String[] args) {

		ListIterator<String> Listiter=null;
		List<String> MobilePhones=new ArrayList<String>();
		
		MobilePhones.add("IPhone");
		MobilePhones.add("Samsung");
		MobilePhones.add("Motorola");
		MobilePhones.add("MI");
		MobilePhones.add("Blackberry");
		
		//obtaining list iterator
		Listiter=MobilePhones.listIterator();
		
		System.out.println("Traversing in forward direction");
		while(Listiter.hasNext()) {
			System.out.println(Listiter.next());
		}
		
		System.out.println("Traversing in Backward direction");
		while(Listiter.hasPrevious()) {
			System.out.println(Listiter.previous());
		}

	}

}
