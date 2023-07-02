/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * @author Atanu Bhowmick
 *
 */
public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle drawn");
		color.applyColor();
	}

}
