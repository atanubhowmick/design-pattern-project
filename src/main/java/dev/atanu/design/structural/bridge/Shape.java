/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * @author Atanu Bhowmick
 *
 */
public abstract class Shape {

	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}

	public abstract void draw();
}
