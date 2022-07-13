package exceptionHandleIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOddExceptionHandle {

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("How many values you want to enter? ");
			int count=input.nextInt();
			while(count!=0) {
				System.out.println("Enter number : ");
				int num=input.nextInt();
				
				if(num%2==0) {
					System.out.println("Number is even");
				}else {
					System.out.println("Number is odd");
				}
			}
			input.close();
			
		}
		
		catch(InputMismatchException e) {
			System.out.println("You entered string instead of number");
			
		}

	}

}
