package assignment2;

//Parent Class
class Parent{
	//Data Members
	String bloodgroup="B+";
	String skincolor="Wheatish";
	String nationality="Indian";
	String eyecolor="Brown";
	String height="6'2";
	Parent(){
		System.out.println("In the Parent class");
		System.out.println("Blood Group is: "+bloodgroup);
		System.out.println("Skin Color is: "+skincolor);
		System.out.println("Nationality is: "+nationality);
		System.out.println("Eye Color is: "+eyecolor);
		System.out.println("Height is: "+height);
	}
	
}

//Child Class || SubClass

class Child extends Parent{
void display() {
	System.out.println("----------------------------------------------");
	System.out.println("In the child Class");
	System.out.println("Blood Group is: "+bloodgroup);
	System.out.println("Skin Color is: "+skincolor);
	System.out.println("Nationality is: "+nationality);
	System.out.println("Eye Color is: "+eyecolor);
	System.out.println("Height is: "+height);

}
}

public class Inheritance{
	
	

	public static void main(String[] args) {
		//Child Class object
		Child emp = new Child();
		emp.display();

	}

}
