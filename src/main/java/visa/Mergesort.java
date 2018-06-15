package visa;

public class Mergesort {

	static int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

	public static int[] sort(int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;

			sort(low, mid);
			sort(mid + 1, high);
			merge(low, mid, high);
		}
		return intArr;
	}

	private static void merge(int low, int mid, int high) {
		int[] arr = new int[intArr.length];
		int i, j;
		for (i = low; i <= mid; i++) {
			arr[i] = intArr[i];
		}
		for (j = mid + 1; j <= high; j++) {
			arr[high + mid + 1 - j] = intArr[j];
		}
		i = low;
		j = high;
		for (int k = low; k <= high; k++) {
			if (arr[i] <= arr[j]) {
				intArr[k] = arr[i];
				i++;
			} else {
				intArr[k] = arr[j];
				j--;
			}
		}
	}

	public static void main(String[] args) {

		// int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };
		int[] arr = sort(0, intArr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + ": " + arr[i]);
		}
	}
}