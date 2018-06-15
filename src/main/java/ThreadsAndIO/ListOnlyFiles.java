package ThreadsAndIO;

import java.io.File;

public class ListOnlyFiles {
	public static void main(String[] args) {
		File curDir = new File("C:\\Tyu");
		getAllFiles(curDir);
	}

	private static void getAllFiles(File curDir) {

		File[] filesList = curDir.listFiles();
		for (File f : filesList) {
			if (f.isDirectory())
				getAllFiles(f);
			if (f.isFile()) {
				System.out.println(f.getName());
			}
		}

	}
}
