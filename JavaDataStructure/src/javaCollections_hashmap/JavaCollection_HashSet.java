package javaCollections_hashmap;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class JavaCollection_HashSet {

	public static void main(String[] args) {

		HashSet<String> hset=new HashSet<String>();
		hset.add("Shivansh");
		hset.add("Agrawal");
		hset.add("Shahpura");
		hset.add("Jaipur");
		hset.add("Rajasthan");
		
		//print the hashset
		System.out.println(hset);
		
		System.out.println("HashSet is empty: "+hset.isEmpty());
		
		hset.remove("Shivansh");
		System.out.println("Hashset after removing 'Shivansh'"+hset);
		
		System.out.println("Size of hashset is : "+hset.size());
		
		System.out.println("------------------------------------------");
		
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("Rahul");
		tset.add("Dravid");
		tset.add("99");
		tset.add("India");
		tset.add("coach");
		
		System.out.println(tset);
		System.out.println("Does tset contains 'Shivansh' in it? "+tset.contains("Shivansh"));
		System.out.println("First element of tset : "+tset.first());
		System.out.println("Last element od tset : "+tset.last());
		System.out.println("Element removed from start: "+tset.pollFirst());
		System.out.println("Element removed from end: "+tset.pollLast());
		System.out.println(tset);
		
		System.out.println("---------------------------------------------------");
		
		TreeMap<Integer, String> tmap=new TreeMap<Integer, String>();
		
		tmap.put(10, "Sachin Tendulker");
		tmap.put(45, "Rohit Sharma");
		tmap.put(18, "Virat Kohli");
		tmap.put(7, "Mahi");
		tmap.put(99, "Rahul Dravid");
		
		System.out.println(tmap);
		System.out.println(tmap.containsKey(45));
		System.out.println(tmap.get(18));
		tmap.replace(45, "Sharmaji ka beta");
		System.out.println(tmap);
		System.out.println(tmap.firstKey());
		System.out.println(tmap.firstEntry());
	}

}
