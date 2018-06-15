package sdet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StartRangeEndRange {
	
	

	public static void main(String[] args) {

		System.out.println("Enter Start & end ranges .... ");

		Scanner scn = new Scanner(System.in);

		int start = scn.nextInt();
		int end = scn.nextInt();

		for (int i = start; i <= end; i++) {

			if (!repeated(i)) {
				System.out.println(i);
			}

		}
	}

	private static boolean repeated(int num) {

		
		ArrayList<Integer> digits = new ArrayList<Integer>();

		for (; num != 0; num /= 10)
			digits.add(num % 10);

		Object[] zipcodeList = digits.toArray();

		boolean duplicates = false;
		for (int j = 0; j < zipcodeList.length; j++)
			for (int k = j + 1; k < zipcodeList.length; k++)
				if (k != j && zipcodeList[k] == zipcodeList[j])
					duplicates = true;

		/*
		 * for (int i = 0; i < my_array.length-1; i++) { for (int j = i+1; j <
		 * my_array.length; j++) { if ((my_array[i] == my_array[j]) && (i != j)) {
		 * return true; } } }
		 */

		return duplicates;
	}

}
