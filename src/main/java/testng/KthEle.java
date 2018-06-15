package testng;

public class KthEle {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		int k = 100;

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (k == arr[i] + arr[j]) {
					System.out.println("elements = " + i + "," + j);
				}
			}
		}

	}

}
