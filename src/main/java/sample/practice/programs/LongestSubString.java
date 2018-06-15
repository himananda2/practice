package sample.practice.programs;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {

		String str = "himanandareddykarna";
		System.out.println(longestNonRepeatingSubstring(str));

	}

	public static String longestNonRepeatingSubstring(String s) {
		Set<Character> characterSet = new HashSet<>();
		String longest = "";
		int start = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			while (characterSet.contains(c)) {
				characterSet.remove(s.charAt(start));
				start++;
			}
			characterSet.add(c);
			if (max < i - start + 1) {
				max = i - start + 1;
				longest = s.substring(start, i + 1);
			}
		}
		return longest;

	}

}
