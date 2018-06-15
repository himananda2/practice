package sdet;

import java.util.HashMap;

public class A2Z2 {

	public static void main(String[] args) {

		String str = "1126#24#312#16#";

		// ArrayList list = new ArrayList();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != '#') {

				map.put(i, Integer.valueOf("" + str.charAt(i)));

			} else {

				map.put(i, Integer.valueOf(str.charAt(i - 2) + "" + str.charAt(i - 1)));

				// list.add(Integer.valueOf(str.charAt(i - 2) + "" + str.charAt(i - 1)));

				map.remove(i - 2);
				map.remove(i - 1);

			}
		}

		for (int i = 1; i <= 26; i++) {
			map2.put(i, 0);
		}

		Object[] in = map.values().toArray();

		for (int j = 0; j < map.size(); j++) {

			/*
			 * if (map2.containsKey(map.get(j))) {
			 * 
			 * map2.put(map.get(j), 1); }
			 */

			if (map2.containsKey(in[j])) {

				map2.put((Integer) in[j], 1);
			}

		}

		System.out.println(map2.values());
	}

}
