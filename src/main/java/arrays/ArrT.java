package arrays;

public class ArrT {

	public static void main(String[] args) {

		int arr2[] = { 3, 5, 6, 9, 13, 19 };

		int arr[] = { 4, 5, 6, 8, 9 };

		int n = 6;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == n) {
				System.out.println(i);
			} else if (arr[i] > n && (i == 0)) {
				System.out.println(0);
			} else if ((arr[i] < n) && (i != arr.length - 1) && (arr[i + 1] > n)) {

				System.out.println(i + 1);

			} else if (arr[i] < n && (i == arr.length - 1)) {
				System.out.println(arr.length);
			}
		}
	}

}
