/**
 * 
 */
package dev.atanu.design.structural.flyweight;

/**
 * @author Atanu Bhowmick
 * 
 */
public class ThickBrush implements Brush {

	private String color;
	final BrushSize brushSize = BrushSize.THICK;

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw(String content) {
		System.out.println("Drawing '" + content + "' in " + brushSize + " color : " + color);
	}

}
