package sdet;

import java.util.ArrayList;
import java.util.HashMap;

public class A2Z {

	public static void main(String[] args) {

		String str = "1126#24#";

		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {

			list.add(str.charAt(i));
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 1; i <= 26; i++) {
			map.put(i, 0);
		}

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == '#') {

				System.out.println("i-2 = " + list.get(i - 2));

				char i2 = list.get(i - 2);
				System.out.println("i-1 = " + list.get(i - 1));
				char i1 = list.get(i - 1);

				String qwe = i2 + "" + i1;
				System.out.println("qwe = " + qwe);

				String s = i2 + "" + i1;

				System.out.println("S valie =" + s);
				map.put(Integer.parseInt(s), 1);
				list.add(i, '&');
				list.add(i - 1, '&');
				list.add(i - 2, '&');
				/*
				 * list.remove(i); list.remove(i - 1); list.remove(i - 2);
				 */
			} /*
				 * else if (list.get(i) == "(") {
				 * 
				 * }
				 */
		}

		for (int i = 0; i < list.size(); i++) {

			map.put(Character.getNumericValue(list.get(i)), 1);
		}

		for (int i = 0; i < map.size(); i++) {

			System.out.print(map.get(i) + " ");
		}
	}

}
