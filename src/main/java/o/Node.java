package o;

import java.util.Vector;

class Node {
	int x = 0, y = 0; /* state variables */
	Node parent = null; /* parent link */

	Node(int x, int y, Node parent) {
		this.x = x;
		this.y = y;
		this.parent = parent;
	}

	public String toString() {
		return (x + " " + y);
	}

	public boolean equals(Object node) { /* argument has to be an Object */
		return (((Node) node).x == x && ((Node) node).y == y);
	}

	Vector<Node> getPath(Vector<Node> v) {
		v.insertElementAt(this, 0);
		if (parent != null)
			v = parent.getPath(v);
		return (v);
	}

	Vector<Node> getPath() {
		return (getPath(new Vector<Node>()));
	}

}