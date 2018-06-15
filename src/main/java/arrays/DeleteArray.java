package arrays;

import java.util.Arrays;

public class DeleteArray {
	/**
	 * @Author:candid
	 * @Description:To Delete a element in an Array
	 */

	public static void main(String[] arguments) {
		// internalize the array
		int arg[] = { 5, 6, 8, 9, 10 };
		// Delete the Array Element position
		int pos = 3;
		// Before Delete Array Output
		for (int k = 0; k < arg.length; k++) {
			System.out.println(arg[k]);
		}
		for (int i = 0; i < arg.length; i++) {
			// Delete Function
			if (pos == i) {
				for (int j = i + 1; i < arg.length - 1; j++) {
					arg[i] = arg[j];
					i++;
				}
			}
		}
		// After delete the array element Output
		System.out.println("The output of Array After Delete");
		for (int i = 0; i < arg.length ; i++) {
			System.out.println(arg[i]);
			
			//System.out.println(Arrays.toString(arr));
		}
	}
}