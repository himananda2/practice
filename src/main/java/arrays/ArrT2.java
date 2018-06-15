package arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrT2 {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int sortedArrayCount = scanner.nextInt();

		scanner.skip("\r\n|[\n\r\u2028\u2029\u0085])*");

		long[] sortedArray = new long[sortedArrayCount];

		for (int sortedArrayInt = 0; sortedArrayInt < sortedArrayCount; sortedArrayInt++) {
			long sortedArrayItem = scanner.nextLong();
			scanner.skip("\r\n|[\n\r\u2028\u2029\u0085])*");
			sortedArray[sortedArrayInt] = sortedArrayItem;

		}

		long searchValue = scanner.nextLong();
		scanner.skip("\r\n|[\n\r\u2028\u2029\u0085])*");

		int res = indexOfSearchValue(sortedArray, searchValue);

		bufferedWriter.write(String.valueOf(res));
		bufferedWriter.newLine();
		scanner.close();

	}

	private static int indexOfSearchValue(long[] sortedArray, long searchValue) {

		for (int i = 0; i < sortedArray.length; i++) {

			if (sortedArray[i] == searchValue) {
				return i;
			} else if (sortedArray[i] > searchValue && (i == 0)) {
				return 0;
			} else if ((sortedArray[i] < searchValue) && (i != sortedArray.length - 1)
					&& (sortedArray[i + 1] > searchValue)) {

				return i + 1;

			} else if (sortedArray[i] < searchValue && (i == sortedArray.length - 1)) {
				return sortedArray.length;
			}
		}
		return 0;
	}

}
