package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Tyu\\New folder\\this.txt");
		// FileInput fi = new FileInputStream(f);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);

		String ss = br.readLine();

		System.out.println(ss);
		System.out.println("-----------------------------");
		String ee;
		while ((ee = br.readLine()) != null) {
			System.out.println(ee);
		}

	}

}
