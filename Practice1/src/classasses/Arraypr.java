package classasses;

import java.util.Scanner;

public class Arraypr {
	
	public static int[] maxmin(int []myArray, int []result) {
		
		int min = myArray[0];
		int max = 0;
		
		for(int i=0;i<myArray.length;i++) {
				if(myArray[i]>max) {
					max = myArray[i];
			}
		}
		
		for(int i=0;i<myArray.length;i++) {
				if(myArray[i]<min) {
					min = myArray[i];
			}
		}
		
		result[0]=min;
		result[1]=max;
		return result;
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of arrays : ");
		int numbers = input.nextInt();
		int result[] = {0,0};
		int resultone[] = {0,0};

		for (int j = 0; j <= numbers-1; j++) {
			System.out.println("Enter the size of array " + j + " : ");
			int size = input.nextInt();
			int[] arr = new int[size];

			System.out.println("Enter the values of array " + j + " : ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = input.nextInt();
			}

			result = maxmin(arr, result);
			for(int i=0;i<2;i++) {
				resultone[i] = (result[i] + resultone[i]);
			}
			

		}

		System.out.println("Sum of minimum value is: " + result[0]);
		System.out.println("Sum of maximum value is: " + result[1]);
		input.close();

}
}
