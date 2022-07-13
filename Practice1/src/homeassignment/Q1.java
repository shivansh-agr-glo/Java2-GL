package homeassignment;

import java.util.*;

public class Q1 {
	
	public static int calculatenum(int remainder, int num, int reversednum) {
		if(num!=0) {
			remainder=num%10;
			reversednum=reversednum*10+remainder;
			num /= 10;
			reversednum=calculatenum(remainder, num, reversednum);
		}
		
		return reversednum;
		
	}
	
	public static String calculatestr(String str, String reversedstr, int strLength) {
		if(strLength!=0) {
			reversedstr=reversedstr+str.charAt(strLength-1);
			strLength -=1;
			reversedstr=calculatestr(str, reversedstr, strLength);
		}
		return reversedstr;
		
	}

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
			if(num!=0) {
				reversednum = calculatenum(remainder, num, reversednum);
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
				reversedstr=calculatestr(str, reversedstr, strLength);
					
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
