package sample.practice.programs;

public class MinValueArray {

	public static void main(String[] args) {

		int[] arr = { 11, 7, 2, 5, 7, 8 };

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {

				min = arr[i];
			}
		}

		System.out.println("min = " + min);
	}

}