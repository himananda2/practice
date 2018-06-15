/*package io;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSThreeJugProblem2 {
	private static List visitedStates = new ArrayList();
	private static Queue stateQueue = new LinkedList();

	public static void main(String[] args) {
		State currentState = new State(0, 0);
		// Add current state to state Queue.
		stateQueue.add(currentState);
		do {
			// Get the first Element from Queue.
			State firstElementInQueue = (State) stateQueue.peek();
			// If the first Element is the Goal
			// We are done.
			if (firstElementInQueue.isGoal()) {
				for (State p : visitedStates) {
					System.out.println(p.toString());
				}
				// There is no recursion here, so simple return would do.
				return;
			} else {
				// Add firstElement to visited States
				visitedStates.add(firstElementInQueue);
				// Get the children of first element
				List children = firstElementInQueue.getChildren();
				for (State v : children) {
					// if children has not already been visited.
					if (!visitedStates.contains(v)) {
						// add the child to state Queue.
						stateQueue.add(v);
					}
				}
				// Remove the first element from state queue.
				stateQueue.remove(firstElementInQueue);
			}
			// do this till state queue is empty.
		} while (!stateQueue.isEmpty());
	}
}*/