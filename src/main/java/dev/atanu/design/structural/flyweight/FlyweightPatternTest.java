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
		redThickBrush1.draw("Hello There !!");

		// Red Brush is shared
		Brush redThickBrush2 = BrushFactory.getThickBrush("RED");
		redThickBrush2.draw("Hello There Again !!");

		System.out.println("Hashcode: " + redThickBrush1.hashCode());
		System.out.println("Hashcode: " + redThickBrush2.hashCode());

		// New thin Blue Brush
		Brush blueThinBrush1 = BrushFactory.getThinBrush("BLUE"); // created new pen
		blueThinBrush1.draw("Hello There !!");

		// Blue Brush is shared
		Brush blueThinBrush2 = BrushFactory.getThinBrush("BLUE"); // created new pen
		blueThinBrush2.draw("Hello There Again!!");

		System.out.println("Hashcode: " + blueThinBrush1.hashCode());
		System.out.println("Hashcode: " + blueThinBrush2.hashCode());

		// New MEDIUM Yellow Brush
		Brush yellowThinBrush1 = BrushFactory.getMediumBrush("YELLOW");
		yellowThinBrush1.draw("Hello There !!");

		// Yellow brush is shared
		Brush yellowThinBrush2 = BrushFactory.getMediumBrush("YELLOW");
		yellowThinBrush2.draw("Hello There Again!!");

		System.out.println("Hashcode: " + yellowThinBrush1.hashCode());
		System.out.println("Hashcode: " + yellowThinBrush2.hashCode());
	}

}
