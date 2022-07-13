package classasses;

interface Parent{
	//Data Members
	String bloodgroup="B+";
	public void fun();
	
}

//Child Class || SubClass

interface Child{
	public void display();
}

class Grandchild implements Parent, Child{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	
}
public class Multipleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
