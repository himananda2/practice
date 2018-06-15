package strings;

import java.util.*;
import java.io.*;

public class LogestWord {
	public static String LongestWord(String sen) {

		// code goes here
		/*
		 * Note: In Java the return type of a function and the parameter types being
		 * passed are defined, so this return call must match the return type of the
		 * function. You are free to modify the return type.
		 */

		String[] words = sen.split("\\W+");

		String maxWord = "";

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > maxWord.length()) {
				maxWord = words[i];
			}
		}

		return maxWord;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(LongestWord(s.nextLine()));
	}

}
