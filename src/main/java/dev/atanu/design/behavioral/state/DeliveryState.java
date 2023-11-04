/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public class DeliveryState implements State {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	@Override
	public void prev(Package pkg) {
		pkg.setState(new ShippingState());
	}

	@Override
	public void printStatus() {
		System.out.println("Out for delivery.");
	}

}
