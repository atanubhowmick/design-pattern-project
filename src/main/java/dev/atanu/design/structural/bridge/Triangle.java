/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * @author Atanu Bhowmick
 *
 */
public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void draw() {
		System.out.println("Triangle drawn");
		color.applyColor();
	}

}
