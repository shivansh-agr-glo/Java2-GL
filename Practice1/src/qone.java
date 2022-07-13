import java.util.*;
public class qone {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the age of the person:");
		int age=input.nextInt();
		
		if(age>0 && age<18){
			System.out.println("The person is not eligible for voting");
		}else if(age>=18) {
			System.out.println("The person is eligible for voting");
		}else {
			System.out.println("Invalid age");
		}
		input.close();

	}

}
