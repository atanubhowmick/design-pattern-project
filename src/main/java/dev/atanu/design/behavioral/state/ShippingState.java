/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public class ShippingState implements State {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveryState());
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new OrderedState());
	}

	@Override
	public void printStatus() {
		System.out.println("Package is shippedn to the currier. Currently in transition.");
	}
}
