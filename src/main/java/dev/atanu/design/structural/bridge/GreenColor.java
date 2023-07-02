/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * @author Atanu Bhowmick
 *
 */
public class GreenColor implements Color {

	@Override
	public void applyColor() {
		System.out.println("Applying color - Green");
	}

}
