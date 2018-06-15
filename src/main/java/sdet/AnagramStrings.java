package sdet;

import java.util.Scanner;

public class AnagramStrings {

	public static void main(String[] args) {

		
		System.out.println("Enter two Strings ........");
		
		Scanner scn = new Scanner(System.in);
		
		//String str1 = "peek", str2 = "keep";
		
		String str1=scn.nextLine();
		String str2=scn.nextLine();

		String sortedS1 = sortedString(str1);
		String sortedS2 = sortedString(str2);

		if(sortedS1.equals(sortedS2)) {
			System.out.println("Given Strings are Anagram ... ");
		}else {
			System.out.println("Given Strings are NOT Anagram ... ");
		}

	}

	private static String sortedString(String str) {
		
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {

					char temp;
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}

			}

		}

		return String.valueOf(ch);
	}

}
