package homeassignment;

import java.util.Scanner;

public class Qtwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		int reversednum=0, remainder=0;
		while(num!=0) {
			remainder=num%10;
			reversednum=reversednum*10+remainder;
			num /= 10;
		}
		System.out.println(reversednum+ " is the reversed number");
		input.close();

	}

}
