package ThreadsAndIO;

import java.io.File;

public class MyFile {

	public static void main(String[] args) {

		File file = new File("C:\\Tyu");

		getAllTheFiles(file);
	}

	private static void getAllTheFiles(File file) {

		File[] f = file.listFiles();

		for (File fi : f) {

			if (fi.isDirectory()) {
				getAllTheFiles(fi);
			}
			if (fi.isFile()) {
				System.out.println(fi.getName());
			}
		}

	}

}
