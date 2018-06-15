package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Remove {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		HashMap map = new HashMap();
		
		map.remove(null);
		
		//list.remove(index);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int n = 3, c = 0, k = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 3) {

				k++;
			} else {
				arr[c++] = arr[i];

			}

		}
		
		//Arrays
		
		while(k>0) {}

		System.out.println(Arrays.toString(arr));

	}

}
