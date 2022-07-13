package assignment2;

import java.util.Scanner;

//child class
class derivedclass extends MainClass{
	
	
}


//public class
public class MainClass {
	
	//even or odd
	void logic(int num) {
		if(num%2==0) {									//condition check even odd
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
	
	//even odd of first 20 numbers
	void display() {
		System.out.println("\nEven Odd number in the first 20 members");
		//for loop to display even or odd first 20 numbers 
		for(int i=1;i<=20;i++) {
			if(i%2==0) {									//condition check even odd
				System.out.println(i+ " is Even number");
			}else {
				System.out.println(i+ " is Odd number");
			}
		}
	}
	
	//compare three numbers
	void compare(float numone, float numtwo, float numthree) {
		if(numone>numtwo && numone>numthree) {								//condition check comparing
			System.out.println(numone+ " is the largest number");
		}else if(numtwo>numone && numtwo>numthree) {
			System.out.println(numtwo+ " is the largest number");
		}else {
			System.out.println(numthree+ " is the largest number");
		}
	}
	
	//eligible to Vote or not
	void vote(int age) {
		if(age<18){												//condition check eligible to vote
			System.out.println("The person is not eligible for voting");
		}else if(age>=18) {
			System.out.println("The person is eligible for voting");
		}else if(age>0){
			System.out.println("Invalid age. Please enter a number greater than 0");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);								//Scanner to take input from users
		System.out.println("Enter the number to check even odd:");
		int num=input.nextInt();
		derivedclass obj = new derivedclass();             //object of child class
		obj.logic(num);									  //calling logic function(even odd of given number)
		obj.display();                                   //calling display function(even odd 20 numbers)
		System.out.println("\nEnter the number 1 to check greatest among three:");
		float numone=input.nextFloat();	
		System.out.println("Enter the number 2 to check greatest among three:");
		float numtwo=input.nextFloat();
		System.out.println("Enter the number 3 to check greatest among three:");
		float numthree=input.nextFloat();	
		obj.compare(numone, numtwo, numthree);					//calling compare function(greatest among three)
		System.out.println("\nEnter the age of the person to  check if he/she can vote or not:");
		int age=input.nextInt();
		obj.vote(age);									//calling vote function(If the person is eligible to vote or not)
		
		
		input.close();									//input closed to delete dynamic memory

	}

}
