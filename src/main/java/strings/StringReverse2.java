package strings;

public class StringReverse2 {

	public static void main(String[] args) {

		String st = "himananda";

		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length / 2; i++) {

			if (ch[i] > ch[ch.length - 1]) {

				char temp = ch[i];
				ch[i] = ch[ch.length - 1 - i];
				ch[ch.length - 1 - i] = temp;

			}

		}

		String str = String.valueOf(ch);
		System.out.println(str);

	}

}
