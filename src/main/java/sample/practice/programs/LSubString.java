package sample.practice.programs;

import java.util.LinkedHashMap;

public class LSubString {
	static void longestSubstring(String inputString) {

		char[] charArray = inputString.toCharArray();

		String longestSubstring = null;

		int longestSubstringLength = 0;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		// Iterating through charArray

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			// If ch is not present in charPosMap, adding ch into charPosMap along with its
			// position

			if (!map.containsKey(ch)) {
				map.put(ch, i);
			}

			// If ch is already present in charPosMap, reposioning the cursor i to the
			// position of ch and clearing the charPosMap

			else {
				i = map.get(ch);

				map.clear();
			}

			// Updating longestSubstring and longestSubstringLength

			if (map.size() > longestSubstringLength) {
				longestSubstringLength = map.size();

				longestSubstring = map.keySet().toString();
			}
		}

		System.out.println("Input String : " + inputString);

		System.out.println("The longest substring : " + longestSubstring);

		System.out.println("The longest Substring Length : " + longestSubstringLength);
	}

	public static void main(String[] args) {
		longestSubstring("himanandareddykarna");

	}
}