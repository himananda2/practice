package selenium;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AA {

	public static void main(String[] args) throws UnknownHostException {

		try {
			System.out.println("print" + 1 / 0);
		} catch (Exception c) {
			System.out.println("World");

		}
		
		
		InetAddress t1 = InetAddress.getByName("");
		InetAddress t2 = InetAddress.getByName("");

	}

}
