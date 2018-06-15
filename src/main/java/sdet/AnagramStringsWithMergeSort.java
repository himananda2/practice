package sdet;

import java.util.Scanner;

public class AnagramStringsWithMergeSort {

	public static void main(String[] args) {

		System.out.println("Enter two Strings ........");

		Scanner scn = new Scanner(System.in);

		// String str1 = "peek", str2 = "keep";

		String str1 = scn.nextLine();
		String str2 = scn.nextLine();

		//String sortedS1 = mergesort(str1.toCharArray());
		//String sortedS2 = mergesort(str2);

		/*if (sortedS1.equals(sortedS2)) {
			System.out.println("Given Strings are Anagram ... ");
		} else {
			System.out.println("Given Strings are NOT Anagram ... ");
		}
*/
	}
	
	

	private static String mergesort(char[] charArr) {
		
		int n=charArr.length;
		if(n<2) 
			return null;
		//int mid=
		
		return null;
	}



	static void mergesort(int arr[]) {
		int n = arr.length;
		if (n < 2)
			return;
		int mid = n / 2;
		int left[] = new int[mid];
		int right[] = new int[n - mid];
		for (int i = 0; i < mid; i++)
			left[i] = arr[i];
		for (int i = mid; i < n; i++)
			right[i - mid] = arr[i];
		mergesort(left);
		mergesort(right);
		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int nL = left.length;
		int nR = right.length;
		int i = 0, j = 0, k = 0;
		while (i < nL && j < nR) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[i];
				j++;
			}
			k++;
		}
		while (i < nL) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < nR) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
