/**
 * 
 */
package dev.atanu.design.pattern.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public class ChickenSandwich extends Sandwich {

	public ChickenSandwich() {
		this.description = "Chicken Sandwich";
	}

	@Override
	public double price() {
		return 50.0d;
	}

}
