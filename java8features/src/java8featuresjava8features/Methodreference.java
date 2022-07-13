package java8featuresjava8features;

@FunctionalInterface
interface Methodref{
	//abstract method
	public void display();
}

interface MethodrefTwo{
	//abstract method
	static void Printable() {
		System.out.println("Another static method");
	}
}

public class Methodreference {
	
	static void saySomething(){
		System.out.println("Hello! this is static method");
	}

	public static void main(String[] args){
		Methodref object=Methodreference::saySomething;
		object.display();
		
		//predefined functional interface
		Thread obj=new Thread(MethodrefTwo::Printable);
		obj.start();
	}

}
