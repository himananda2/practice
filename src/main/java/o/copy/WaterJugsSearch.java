package o.copy;

import java.util.Vector;

public class WaterJugsSearch {

	boolean isGoal(Node node) {
		return (node.y == 2);
	}

	void run() {
		Vector<Node> open = new Vector<Node>();	
		open.add(new Node(0, 0, null));

		while (open.size() > 0) {
			Node node = open.remove(0);
			if (isGoal(node)) {
				System.out.println("Solution: " + node.getPath());
			} else {
				Vector<Node> successors = getSuccessors(node);
				for (int i = 0; i < successors.size(); i++) {
					Node child = successors.get(i);
					if (!node.getPath().contains((Object) child)) {
						open.add(child);
					}
				}
			}
		}
	}

	Vector<Node> getSuccessors(Node parent) {
		int x = parent.x, y = parent.y;
		Vector<Node> successors = new Vector<Node>();
		if (x < 4 && y > 0) { /* transfer amount z from y to x */
			int z = Math.min(y, 4 - x);
			successors.add(new Node(x + z, y - z, parent));
		}
		if (y < 3 && x > 0) { /* transfer amount z from x to y */
			int z = Math.min(x, 3 - y);
			successors.add(new Node(x - z, y + z, parent));
		}
		if (x > 0) { /* empty x */
			successors.add(new Node(0, y, parent));
		}
		if (y > 0) { /* empty y */
			successors.add(new Node(x, 0, parent));
		}
		if (x < 4) { /* fill x from tap */
			successors.add(new Node(4, y, parent));
		}
		if (y < 3) { /* fill y from tap */
			successors.add(new Node(x, 3, parent));
		}
		return (successors);
	}
}