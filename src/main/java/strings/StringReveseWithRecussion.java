package strings;

public class StringReveseWithRecussion {

	public static void main(String[] args) {

		String str = "himananda";

		// System.out.println(str.indexOf('a'));

		// System.out.println(str.lastIndexOf('a'));

		System.out.println(reverseString(str));

	}

	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}

}
