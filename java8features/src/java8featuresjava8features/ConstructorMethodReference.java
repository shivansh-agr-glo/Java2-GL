package java8featuresjava8features;

interface Messageble{
	Message getMessage(String msg);
}

class Message{
	//constructor
	Message(String msg){
		System.out.println(msg);
	}
}

public class ConstructorMethodReference {

	public static void main(String[] args) {
		
		Messageble object=Message::new;
		object.getMessage("Hey");

	}

}
