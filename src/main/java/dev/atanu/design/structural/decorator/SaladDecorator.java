/**
 * 
 */
package dev.atanu.design.structural.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public class SaladDecorator extends SandwichDecorator {

	private Sandwich currentSandwich;

	public SaladDecorator(Sandwich sandwich) {
		currentSandwich = sandwich;
	}

	@Override
	public String getDescription() {
		return currentSandwich.getDescription() + ", Salad";
	}

	@Override
	public double price() {
		return currentSandwich.price() + 10.0d;
	}
}
