package ram;

import java.util.ArrayList;
import java.util.List;

public class WaterJug10 {
	final static int A = 8;
	final static int B = 5;
	final static int C = 3;
	static int a = 8;
	static int b = 0;
	static int c = 0;
	static int requiredLiter = 4;
	static List<String> visited = new ArrayList<>();
	static List<String> route = new ArrayList<>();

	public static void main(String[] args) {

		while (!solved()) {
			// visited.add("" + a + b + c);
			solveWaterJug(a, b, c);
		}

		// System.out.println(route);
	}

	private static boolean solveWaterJug(int i, int j, int k) {

		int a = i;
		int b = j;
		int c = k;

		if (visited.contains(("" + a + b + c))) {
			return false;
		}
		visited.add("" + a + b + c);
		System.out.println("----------------------" + visited);

		if (a > 0) {
			if (a + b <= B) {
				b = b + a;
				a = 0;
				route.add("" + a + b + c);
			} else {
				a = a - (B - b);   //
				b = B;
				route.add("" + a + b + c);
			}
			if (a + c <= C) {
				c = a + c;
				a = 0;				
				route.add("" + a + b + c);
			} else {
				a = a - (C - c);
				c = C;
				route.add("" + a + b + c);
			}
		}
		if (b > 0) {
			if (a + b <= A) {
				a = b + a;
				b = 0;
				route.add("" + a + b + c);
			} else {
				b = b - (A - a);
				a = A;
				route.add("" + a + b + c);
			}
			if (b + c <= C) {
				c = b + c;
				b = 0;
				route.add("" + a + b + c);
			} else {
				b = b - (C - c);
				c = C;
				route.add("" + a + b + c);
			}
		}
		if (c > 0) {
			if (a + c <= A) {
				a = a + c;
				c = 0;
				route.add("" + a + b + c);
			} else {
				c = c - (A - a);
				a = A;
				route.add("" + a + b + c);
			}
			if (b + c <= B) {
				b = b + c;
				c = 0;
				route.add("" + a + b + c);
			} else {
				c = c - (B - b);
				b = B;
				route.add("" + a + b + c);
			}
		}
		System.out.println(route);
		return false;
	}

	public static boolean solved() {
		if ((a == requiredLiter && b == requiredLiter) || (c == requiredLiter && b == requiredLiter)
				|| (a == requiredLiter && c == requiredLiter)) {
			route.add("" + a + b + c);
			return true;
		}
		return false;
	}

}
