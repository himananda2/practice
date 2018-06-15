package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Tyu\\New folder\\tet.txt");
		// FileInput fi = new FileInputStream(f);

		FileWriter fw = new FileWriter(f);

		fw.write("This is Himananda!, ");
		fw.write("Living in Bangalore");
		fw.flush();
		fw.close();
	}

}
