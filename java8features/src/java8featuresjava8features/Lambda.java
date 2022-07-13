package java8featuresjava8features;

import java.util.ArrayList;
import java.util.List;

interface Add{
	public void numbers();
}

interface Singleparameter{
	public int incrementByFive(int num);
}

interface Stringconcatmultpara{
	public String sConcat(String one, String two);
}

public class Lambda {

	public static void main(String[] args) {
		Add obj=()->{
				System.out.println("overridden");
		};
		obj.numbers();
		
		Singleparameter obje=(num)->num+5;
		System.out.println("Single parameter ans: "+obje.incrementByFive(6));
		
		Stringconcatmultpara objec=(fname, lname) -> fname+ lname;
		System.out.println("My name is: "+objec.sConcat("Shivansh ", "Agrawal"));
		
		
		List<String> list= new ArrayList();
		list.add("Orange");
		list.add("Apple");
		list.add("Guvava");
		list.add("Kiwi");
		list.add("Banana");
		
		System.out.println("List is: ");
		list.forEach((fruits)->System.out.println(fruits));
		
		System.out.println("List is: ");
		for(String display:list)
			System.out.println(display);

	}

}
