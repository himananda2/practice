package strings;

import java.util.HashSet;

public class FirstReapetedChar {

	public static void main(String[] args) {

		String str = "himananda";

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (set.contains(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			} else {
				set.add(str.charAt(i));
			}
		}

	}

}
