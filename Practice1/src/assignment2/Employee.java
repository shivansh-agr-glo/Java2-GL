package assignment2;

public class Employee {
	//Static Method
	static int empID;
	static String empfname;
	static String emplname;
	static String empcity;
	static String empstate;
	
	//Parameterized constructor
	Employee(int empID, String empfname, String emplname, String empcity, String empstate){
		Employee.empID=empID;
		Employee.empfname=empfname;
		Employee.emplname=emplname;
		Employee.empcity=empcity;
		Employee.empstate=empstate;
		
		
	}
	

	public static void main(String[] args) {
		new Employee(2525045, "Shivansh", "Agrawal", "Jaipur","Rajasthan");
		System.out.println("The Employee details are as follows: ");
		System.out.println("Employee ID: "+ Employee.empID);
		System.out.println("First Name: "+ Employee.empfname);
		System.out.println("Last Name: "+ Employee.emplname);
		System.out.println("City: " + Employee.empcity);
		System.out.println("State: " + Employee.empstate);

	}

}
