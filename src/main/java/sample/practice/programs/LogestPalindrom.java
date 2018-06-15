package sample.practice.programs;

public class LogestPalindrom {

	public static void main(String[] args) {

		// String str = "ababcde";
		String str = "99123321456";

		String larzestPalindrom = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				String subS = str.substring(i, j);

				if (subS.length() > 2) {

					if (isPalindrom(subS)) {

						if (subS.length() > larzestPalindrom.length()) {
							larzestPalindrom = subS;
						}

						//System.out.println(subS);
					}
				}
			}
		}
		System.out.println(larzestPalindrom);
	}

	private static boolean isPalindrom(String subS) {

		String s = "";
		for (int i = subS.length() - 1; i >= 0; i--) {
			s = s + subS.charAt(i);
		}
		if (subS.equals(s)) {
			return true;
		} else {
			return false;
		}
	}

}
