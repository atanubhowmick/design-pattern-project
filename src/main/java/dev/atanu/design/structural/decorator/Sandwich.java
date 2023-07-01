/**
 * 
 */
package dev.atanu.design.structural.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public abstract class Sandwich {

	protected String description = "Sandwich";

	public String getDescription() {
		return description;
	}

	public abstract double price();

	@Override
	public String toString() {
		return "Sandwich[" + getDescription() + " - price:" + price() + " INR]";
	}

}
