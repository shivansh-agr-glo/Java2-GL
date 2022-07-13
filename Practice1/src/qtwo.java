import java.util.*;
public class qtwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int a=input.nextInt();
		System.out.println("Enter the number 2:");
		int b=input.nextInt();
		
		if(a==b){
			System.out.println("Both the numbers are equal");
		}else {
			System.out.println("The numbers are not equal");
		}
		input.close();

	}

}
