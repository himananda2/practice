package testng;

import java.util.Iterator;

import java.util.TreeMap;

public class SortWordsInAString {

	public static void main(String[] args) {

		String str = "Altimetrik india pvt ltd.";

		System.out.println(sort(str));
	}

	private static String sort(String str) {

		String st[] = str.split("\\s+");

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

		for (int i = 0; i < st.length; i++) {

			tmap.put(st[i].length(), st[i].toLowerCase().replaceAll("[.]", ""));

		}

		String stt = "";

		Iterator<Integer> itr = tmap.keySet().iterator();

		int key = itr.next();
		String value = tmap.get(key).substring(0, 1).toUpperCase() + tmap.get(key).substring(1);

		tmap.put(key, value);

		Iterator<String> itr2 = tmap.values().iterator();

		while (itr2.hasNext()) {

			String s = itr2.next();
			stt = stt + s + " ";
		}

		return stt.trim() + ".";
	}

}
