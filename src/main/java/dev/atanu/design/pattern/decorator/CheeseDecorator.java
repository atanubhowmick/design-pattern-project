/**
 * 
 */
package dev.atanu.design.pattern.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public class CheeseDecorator extends SandwichDecorator {

	private Sandwich currentSandwich;

	public CheeseDecorator(Sandwich sandwich) {
		currentSandwich = sandwich;
	}

	@Override
	public String getDescription() {
		return currentSandwich.getDescription() + ", Cheese";
	}

	@Override
	public double price() {
		return currentSandwich.price() + 20.0d;
	}
}
