package sample.practice.programs;

import java.util.LinkedList;

public class LogestSubString2 {

	public static void main(String[] args) {

		// String str = "ababcde";
		String str = "99123321456";

		String larzestPalindrom = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				String subS = str.substring(i, j);

				if (isUnique(subS)) {

					if (subS.length() > larzestPalindrom.length()) {
						larzestPalindrom = subS;
					}

					// System.out.println(subS);

				}
			}
		}
		System.out.println(larzestPalindrom);
	}

	private static boolean isUnique(String subS) {
		
		for(int i=0;i<subS.length();i++) {
			for(int j=i+1;j<subS.length();j++) {
				
				if(subS.charAt(i) == subS.charAt(j)) {
					return true;
				}
			}
		}
		
		return false;

	}

}
