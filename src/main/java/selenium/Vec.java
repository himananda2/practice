package selenium;


import java.util.HashSet;
import java.util.Vector;

public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(1);
		v.add(2);
		v.add(2);
		System.out.println(data(v));

	}

	static Vector data(Vector v) {

		return new Vector(new HashSet(v));
	}

}
