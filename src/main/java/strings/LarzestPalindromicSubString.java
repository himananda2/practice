package strings;

import java.util.HashMap;
import java.util.Scanner;

public class LarzestPalindromicSubString {

	public static void main(String[] args) {

		System.out.println("Enter a String ......");

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();

		int len = 0;
		String palindrom = null;

		// String st = "himanandal";

		// System.out.println(st.substring(0,st.length()));

		for (int i = 0; i < str.length() - 2; i++) {

			for (int j = i + 2; j <= str.length(); j++) {

				String subStr = str.substring(i, j);

				if (isPalindrom(subStr) && (len < subStr.length())) {
					palindrom = subStr;
					len = subStr.length();

				}
			}

		}

		System.out.println("Longest Palindromic SubString = " + palindrom);

	}

	private static boolean isPalindrom(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

}
