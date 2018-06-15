package sample.practice;

public class TestExceptions {

	public static void main(String[] args) {

		System.out.println("Before biggining TRY block");

		try {
			int i = 3 / 0;
			System.out.println("In the TRY Block ...");

		} finally {
			System.out.println("In the Finally Block ...");
		}

		System.out.println("After TRY, Finally block ...");
	}

}
