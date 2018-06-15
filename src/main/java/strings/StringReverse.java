package strings;

import java.util.*;
import java.io.*;

class StringReverse {
	public static String FirstReverse(String str) {

		// code goes here
		/*
		 * Note: In Java the return type of a function and the parameter types being
		 * passed are defined, so this return call must match the return type of the
		 * function. You are free to modify the return type.
		 */

		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s = s + str.charAt(i);
		}
		str =s;
		return str;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstReverse(s.nextLine()));
	}

}
