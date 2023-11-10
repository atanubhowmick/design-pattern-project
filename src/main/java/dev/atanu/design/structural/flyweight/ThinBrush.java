/**
 * 
 */
package dev.atanu.design.structural.flyweight;

/**
 * @author Atanu Bhowmick
 * 
 */
public class ThinBrush implements Brush {

	private String color;
	final BrushSize brushSize = BrushSize.MEDIUM;

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing '" + content + "' in " + brushSize + " color : " + color);
	}

}
