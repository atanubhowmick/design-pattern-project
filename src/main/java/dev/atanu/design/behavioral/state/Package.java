/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public class Package {

	private State state = new OrderedState();

	public void previousState() {
		state.prev(this);
	}

	public void nextState() {
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
