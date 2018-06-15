package sdet;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 8, 0 };

		// int l = arr.length - 1;

		for (int i = 0; i < arr.length / 2; i++) {

			int t = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = t;
			// l--;

		}

		System.out.println(Arrays.toString(arr));

	}

}
