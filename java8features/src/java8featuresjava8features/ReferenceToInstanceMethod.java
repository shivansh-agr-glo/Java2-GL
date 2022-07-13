package java8featuresjava8features;

@FunctionalInterface
interface Instancemethod{
	//abstract method
	public void display();
}

public class ReferenceToInstanceMethod {
	
	public void nonStaticMethod() {
		System.out.println("This is non-static method");
	}

	public static void main(String[] args) {
		
		ReferenceToInstanceMethod object=new ReferenceToInstanceMethod();
		
		Instancemethod obj=object::nonStaticMethod;
		obj.display();
		
	}

}
