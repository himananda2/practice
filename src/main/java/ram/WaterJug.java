package ram;

import java.util.ArrayList;
import java.util.List;

public class WaterJug {

	static int A = 8;

	static int B = 5;

	static int C = 3;

	static int requiredLiter;

	static List<String> visited = new ArrayList<>();

	static List<String> route = new ArrayList<>();

	public static void main(String[] args) {
		requiredLiter = 4;

		solveWaterJug(8, 0, 0);
		System.out.println(route);
		System.out.println("---------------------------------------------");
		for (String path : route) {
			System.out.println(path);
		}
		if (route.isEmpty()) {
			System.out.println("not possible");
		}

	}

	private static boolean solveWaterJug(int a, int b, int c) {

		if ((a == requiredLiter && b == requiredLiter) || (c == requiredLiter && b == requiredLiter)
				|| (a == requiredLiter && c == requiredLiter)) {
			route.add("" + a + b + c);
			return true;
		}

		if (visited.contains("" + a + b + c)) {
			return false;
		}

		visited.add("" + a + b + c);

		if (a > 0) {
			if (a + b <= B) {
				if (solveWaterJug(0, a + b, c)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug((a - (B - b)), B, c)) {
					route.add("" + a + b + c);
					return true;
				}
			}

			if (a + c <= C) {
				if (solveWaterJug(0, b, a + c)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug((a - (C - c)), b, C)) {
					route.add("" + a + b + c);
					return true;
				}
			}

		}
		if (b > 0) {
			if (a + b <= A) {
				if (solveWaterJug(a + b, 0, c)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug(A, (b - (A - a)), c)) {
					route.add("" + a + b + c);
					return true;
				}
			}
			if (b + c <= C) {
				if (solveWaterJug(a, 0, b + c)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug(a, (b - (C - c)), C)) {
					route.add("" + a + b + c);
					return true;
				}
			}

		}
		if (c > 0) {
			if (a + c <= A) {
				if (solveWaterJug(a + c, b, 0)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug(A, b, (c - (A - a)))) {
					route.add("" + a + b + c);
					return true;
				}
			}
			if (b + c <= B) {
				if (solveWaterJug(a, b + c, 0)) {
					route.add("" + a + b + c);
					return true;
				}
			} else {
				if (solveWaterJug(a, B, (c - (B - b)))) {
					route.add("" + a + b + c);
					return true;
				}
			}

		}

		return false;

	}

}
