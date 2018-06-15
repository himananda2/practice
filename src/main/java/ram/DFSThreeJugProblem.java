package ram;

import java.util.ArrayList;
import java.util.List;

public class DFSThreeJugProblem {
	public static void main(String[] args) {
		State currentState = new State(0, 0);
		List<Object> visitedStates = new ArrayList<Object>();
		// Check if the current State has a solution
		// given a set of visited States.
		dfs(currentState, visitedStates);
	}

	public static void dfs(Object c2, List<Object> vStates) {
		// if it is GOAL
		if (((State) c2).isGoal()) {
			// That's it we are done.

			for (Object v : vStates) {
				System.out.println(v);
				// System.out.println(c2);
			}
			System.exit(0);
		}

		// if visisted state contains currentState, then just return.
		// This is the wrong branch, and we need not traverse it further.
		if (vStates.contains(c2))
			return;

		// Add current state to visited states.
		vStates.add(c2);

		// Make clone of visited states.
	
		List<Object> clonedVStates = new ArrayList<Object>(vStates);
		// Find the set of possible children of current state.
		List children = ((State) c2).getChildren();
		for (Object c : children) {
			// if a children C is not in the visited states
			// again call DFS on current child and visited States.
			if (!clonedVStates.contains(c)) {
				dfs(c, clonedVStates);
			}
		}
	}
}