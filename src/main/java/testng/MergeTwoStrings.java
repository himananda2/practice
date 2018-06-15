package testng;

public class MergeTwoStrings {

	public static void main(String[] args) {

		String s1 = "111";
		String s2 = "0000";

		String mergeString = merge(s1, s2);

		System.out.println(mergeString);

	}

	private static String merge(String s1, String s2) {

		String str = "";

		int length = 0;

		if (s1.length() > s2.length()) {
			length = s2.length();

			for (int i = 0; i < length; i++) {

				str = str + s1.charAt(i) + s2.charAt(i);
			}

			str = str + s1.substring(length, s1.length());

		} else {
			length = s1.length();

			for (int i = 0; i < length; i++) {

				str = str + s1.charAt(i) + s2.charAt(i);
			}

			str = str + s2.substring(length, s2.length());

		}
		return str;

	}
}