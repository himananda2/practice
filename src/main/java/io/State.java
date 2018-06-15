package io;

import java.util.ArrayList;
import java.util.List;

public class State {
	int a = 0;// 3
	int b = 0;// 5
	int c = 8;// 8

	public State(int a, int b) {
		this.a = a;
		this.b = b;
		this.c = 8 - a - b;
	}

	public boolean isGoal() {
		return (b == 4 && c == 4);
	}

	public boolean equals(Object xx) {
		State x = (State) xx;
		if (this.a == x.a && this.b == x.b && this.c == x.c) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return 8;
	}

	public List<State> getChildren() {
		List<State> children = new ArrayList<State>();
		// a -> b
		if (a != 0 && b != 5)// if a is not empty
		{
			if (a + b <= 5) {
				children.add(new State(0, a + b));
			} else {
				children.add(new State(a + b - 5, 5));
			}
		}
		// a->c
		if (a != 0 && c != 8) {
			// We are pouring completely from a to c
			// a will be 0
			// b will be 8-a-c
			// c will be a+c
			children.add(new State(0, 8 - a - c));
		}
		// b->a
		if (b != 0 && a != 3) {
			if (a + b <= 3) {
				children.add(new State(a + b, 0));
			} else {
				children.add(new State(3, a + b - 3));
			}
		}
		// b->c
		if (b != 0 && c != 8) {
			// We are pouring completely from b to c
			// a will be 8-b-c
			// b will be 0
			// c will be b+c
			children.add(new State(8 - b - c, 0));
		}
		// c->a
		if (c != 0 && a != 3) {
			if (c + a <= 3) {
				children.add(new State(c + a, 8 - c - a));
			} else {
				// a will be full i.e. 3 liters
				// b will be 8-c-a
				// c will be c+a-3
				children.add(new State(3, 8 - c - a));

			}
		}
		// c->b
		if (c != 0 && b != 5) {
			if (c + b <= 5) {
				children.add(new State(8 - c - b, c + b));
			} else {
				children.add(new State(8 - c - b, 5));
			}
		}
		return children;
	}

	@Override
	public String toString() {
		return "{" + a + "," + b + "," + c + "}";
	}
}