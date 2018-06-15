package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter size of an array ..");
		int size = scan.nextInt();
		
		
		int arr[] = new int[size];
		System.out.println("enter array elements ..");
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}

		int[] revArr = reverseArray(arr);
		for (int i = 0; i < revArr.length; i++) {

			System.out.println(revArr[i]);
		}
	}

	private static int[] reverseArray(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}

		return arr;
	}

}
