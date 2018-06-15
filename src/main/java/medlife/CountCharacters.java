package medlife;

import java.util.Scanner;

public class CountCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next().toLowerCase();
		System.out.println("Enter a character to count in the string " + s);
		char c = sc.next(".").toLowerCase().charAt(0); // This logic is to read
														// only one character
		int cn = 0;
		for (char cc : s.toCharArray()) {
			if (c == cc) {
				cn++;
			}
		}
		System.out.println(c + " occurs " + cn + " times in " + s);
		sc.close();
	}
}