package homeassignment;

import java.util.Scanner;

public class Fibbonci {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("How many times you want to print the Fibbonici series: ");
		int num=input.nextInt();
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=num;i++) {
			
			num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		input.close();

	}

}
