package io;

import java.util.ArrayList;
import java.util.List;

public class DFSThreeJugProblem {
	public static void main(String[] args) {
		State currentState = new State(0, 0);
		List visitedStates = new ArrayList();
		// Check if the current State has a solution
		// given a set of visited States.
		dfs(currentState, visitedStates);
	}

	public static void dfs(State currentState, List vStates) {
		// if it is GOAL
		if (currentState.isGoal()) {
			// That's it we are done.
			/*
			 * for (State v : vStates) { System.out.println(v);
			 * System.out.println(currentState); }
			 */
			for (int i = 0; i < vStates.size(); i++) {
				System.out.println(vStates.get(i));
				//System.out.println(currentState);
			}
			System.exit(0);
		}

		// if visisted state contains currentState, then just return.
		// This is the wrong branch, and we need not traverse it further.
		if (vStates.contains(currentState))
			return;

		// Add current state to visited states.
		vStates.add(currentState);

		// Make clone of visited states.
		List clonedVStates = new ArrayList(vStates);
		// Find the set of possible children of current state.
		List children = currentState.getChildren();

		for (int i = 0; i < children.size(); i++) {
			if (!clonedVStates.contains(children.get(i))) {
				dfs((State) children.get(i), clonedVStates);
			}
		}

/*		for (State c : children) {
			// if a children C is not in the visited states
			// again call DFS on current child and visited States.
			if (!clonedVStates.contains(c)) {
				dfs(c, clonedVStates);
			}
		}*/
	}
}
