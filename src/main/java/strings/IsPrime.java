package strings;

public class IsPrime {

	public static void main(String[] args) {

		int num = 7;
		int c = 0;

		for (int i = 2; i < num / 2; i++) {

			if (num % i == 0) {
				c++;
				break;

			}
		}
		if (c > 0) {
			System.out.println("Given number : " + num + " is NOT a prime number");
		} else {
			System.out.println("Given number : " + num + " is a prime number");
		}

	}

}
