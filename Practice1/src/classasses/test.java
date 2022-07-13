package classasses;

import java.util.*;

public class test {

	static int totalMin = 0;
	static int totalMax = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 1; j <= 5; j++) {
			System.out.println("Enter the size of an array" + j + " : ");
			int size = sc.nextInt();
			int[] arr = new int[size];

			System.out.println("Enter the values in the array: ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			minAndMaxInArray(arr);
		}

		System.out.println("Sum of minimum value is: " + (totalMin));
		System.out.println("Sum of maximum value is: " + (totalMax));
		sc.close();
	}

	public static void minAndMaxInArray(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {
				min = arr[i];
			}

		}

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}

		totalMin = totalMin + min;
		totalMax = totalMax + max;

	}

}
