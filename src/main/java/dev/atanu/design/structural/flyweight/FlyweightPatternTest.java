/*
 * 
 */
package dev.atanu.design.structural.flyweight;

/**
 * https://www.javadevjournal.com/java-design-patterns/flyweight-design-pattern/
 * 
 * @author Atanu Bhowmick
 * 
 */
public class FlyweightPatternTest {

	public static void main(String[] args) {
		Brush redThickBrush1 = BrushFactory.getThickBrush("RED");
		redThickBrush1.draw("Triangle");

		// Red Brush is shared
		Brush redThickBrush2 = BrushFactory.getThickBrush("RED");
		redThickBrush2.draw("Square");

		System.out.println("Hashcode: " + redThickBrush1.hashCode());
		System.out.println("Hashcode: " + redThickBrush2.hashCode());

		// New thin Blue Brush
		Brush blueThinBrush1 = BrushFactory.getThinBrush("BLUE"); // created new pen
		blueThinBrush1.draw("Ocean");

		// Blue Brush is shared
		Brush blueThinBrush2 = BrushFactory.getThinBrush("BLUE"); // created new pen
		blueThinBrush2.draw("Ocean with ship!!");

		System.out.println("Hashcode: " + blueThinBrush1.hashCode());
		System.out.println("Hashcode: " + blueThinBrush2.hashCode());

		// New MEDIUM Yellow Brush
		Brush yellowThinBrush1 = BrushFactory.getMediumBrush("YELLOW");
		yellowThinBrush1.draw("Pentagon");

		// Yellow brush is shared
		Brush yellowThinBrush2 = BrushFactory.getMediumBrush("YELLOW");
		yellowThinBrush2.draw("Hexagon");

		System.out.println("Hashcode: " + yellowThinBrush1.hashCode());
		System.out.println("Hashcode: " + yellowThinBrush2.hashCode());
	}

}
