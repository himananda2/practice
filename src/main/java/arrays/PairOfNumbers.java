package arrays;

public class PairOfNumbers {

	public static void main(String[] args) {

		int[] arr = { -5, -4, -1, 1, 3, 4, 6, 8, 9, 10, 14, 16, 19 };

		int k = 10;

		int i = 0, j = arr.length - 1;

		while (i < j) {

			if (arr[i] + arr[j] == k) {
				System.out.println("Pair of elements = " + arr[i] + ", " + arr[j]);
				i++;
				j--;
			} else if (arr[i] + arr[j] < k) {
				i++;
			} else if (arr[i] + arr[j] > k) {
				j--;
			}
		}
	}

}
