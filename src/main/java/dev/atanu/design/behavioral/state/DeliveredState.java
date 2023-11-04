/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public class DeliveredState implements State {

	@Override
	public void next(Package pkg) {
		System.out.println("This package is already delivered.");
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new DeliveryState());
	}

	@Override
	public void printStatus() {
		System.out.println("Package is delivered to the customer.");
	}

}
