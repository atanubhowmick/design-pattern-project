/**
 * 
 */
package dev.atanu.design.structural.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public class VegSandwich extends Sandwich {

	public VegSandwich() {
		this.description = "Veg Sandwich";
	}

	@Override
	public double price() {
		return 40.0d;
	}

}
