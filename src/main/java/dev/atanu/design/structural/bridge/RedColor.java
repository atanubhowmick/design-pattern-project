/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * @author Atanu Bhowmick
 *
 */
public class RedColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying color - Red");
	}

}
