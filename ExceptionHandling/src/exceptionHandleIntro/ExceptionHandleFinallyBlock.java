package exceptionHandleIntro;

public class ExceptionHandleFinallyBlock {
	static int MyMethod() {
		try {
			return 110;
		}
		finally {
			System.out.println("Method's finally block");
		}
	}

	public static void main(String[] args) {

		try {
			int num=22/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println("Number should not be devided by zero");
		}
		
		finally {
			System.out.println("This block will execute every time");
		}
		
		int a = MyMethod();
		System.out.println(a);

	}

}
