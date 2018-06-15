package visa;

import java.util.HashMap;

public class CountDupsInArray {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 1, 3, 2, 6, 5, 7, 8, 6, 3, 3, 6, 7 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(arr[i])) {

				map.put(arr[i], 1);
			} else {

				map.put(arr[i], map.get(arr[i]) + 1);
			}

		}

		System.out.println(map);
	}

}
