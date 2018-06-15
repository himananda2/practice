package arrays;

import java.util.*;
import java.io.*;

class Main1 {
	public static int FirstFactorial(int num) {

		// code goes here
		/*
		 * Note: In Java the return type of a function and the parameter types being
		 * passed are defined, so this return call must match the return type of the
		 * function. You are free to modify the return type.
		 */
		int output;
		if (num == 1) {
			return 1;
		}
		output = num * FirstFactorial(num - 1);
		return output;

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(FirstFactorial(s.nextInt()));
	}

}