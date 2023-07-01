/**
 * 
 */
package dev.atanu.design.structural.decorator;

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
