/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public class OrderedState implements State {

	@Override
	public void next(Package pkg) {
		pkg.setState(new ShippingState());
	}

	@Override
	public void prev(Package pkg) {
		System.out.println("This is the initial state.");
	}

	@Override
	public void printStatus() {
		System.out.println("Order has been placed successfully. The package would be shipped to the currier shortly.");
	}

}
