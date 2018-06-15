package arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 2, 0, -1, 4, 5, -4, 0, 1, 0, 9 };

		System.out.println(Arrays.toString(moveAllZerosToEnd(arr)));
	}

	private static int[] moveAllZerosToEnd(int[] arr) {

		int c = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[c++] = arr[i];
			}
		}

		while (c < arr.length) {
			arr[c++] = 0;
		}

		return arr;
	}

}



