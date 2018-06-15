package sample.practice.programs;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {

		String str = "himananda reddy";

		char[] ch = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			// System.out.println("CH : "+ch[i]);

			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		Set<Character> keys = map.keySet();

		for (Character ch2 : keys) {
			if (map.get(ch2) > 1) {
				System.out.println(ch2 + " : " + map.get(ch2));
			}
		}
	}

}
