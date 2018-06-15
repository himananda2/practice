package visa;

public class ReverseWord {

	public static void main(String[] args) {

		String word = "rameswaram";

		System.out.println(revWord(word));

	}

	private static String revWord(String word) {

		String rev = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		return rev;
	}

}
