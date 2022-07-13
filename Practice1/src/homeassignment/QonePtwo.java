package homeassignment;

import java.util.Scanner;

public class QonePtwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("You are going to enter a number or String?");
		System.out.println("Press 1 for Number and 2 for String");
		int a=input.nextInt();
		
		if(a==1) {
			System.out.println("Enter the number:");
			int num=input.nextInt();
			int reversednum=0, remainder=0;
			int origionalnum = num;
			while(num!=0) {
				remainder=num%10;
				reversednum=reversednum*10+remainder;
				num /= 10;
			}
			
			if(origionalnum == reversednum) {
				System.out.println("Palindrome number");
			}else {
				System.out.println("Not Palindrome number");
			}
		}
		
		if(a==2) {
			System.out.println("Enter the String:");
			String str=input.next();
			String reversedstr="";
			int strLength = str.length();
			if(strLength!=0) {
				for(int i=strLength-1;i>=0;i--) {
					reversedstr=reversedstr+str.charAt(i);
				}
					
			}
			if(str.toLowerCase().equals(reversedstr.toLowerCase())) {
				System.out.println("Palindrome String");
			}else {
				System.out.println("Not Palindrome");
			}
			
		}
		
		input.close();

	}

}
