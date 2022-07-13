package exceptionHandleIntro;

public class ThrowKey {
	
	static void eligibility(int weight, int age) {
		if(weight<12 && age<40) {
			throw new ArithmeticException("Student not eligible");
		}
		else {
			System.out.println("Invalid entry");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to registration");
		eligibility(9,35);
		

	}

}
