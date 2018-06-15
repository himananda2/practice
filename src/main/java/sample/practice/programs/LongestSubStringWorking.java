package sample.practice.programs;

import java.util.LinkedHashMap;

public class LongestSubStringWorking {

	public static void main(String[] args) {

		String str = "himanandareddyrt";

		System.out.println(
				"LongestSubString = " + logestSubString(str).replaceAll("[^a-zA-Z0-9\\s+]", "").replaceAll("\\s+", ""));

	}

	private static String logestSubString(String str) {

		int logestSubStringLength = 0;
		String logestSubString = null;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}

			if (map.size() > logestSubStringLength) {
				logestSubStringLength = map.size();
				logestSubString = map.keySet().toString();
			}

		}

		// System.out.println("longest sub String = " + logestSubString);
		return logestSubString;
	}

}
