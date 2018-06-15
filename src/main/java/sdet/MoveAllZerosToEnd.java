package sdet;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {

		int[] arr = { 5, 0, 3, 0, 6, 9 };

		int[] newArr = new int[arr.length];

		int c = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {

				arr[c] = arr[i];

			}
		}

		for (int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}

}
