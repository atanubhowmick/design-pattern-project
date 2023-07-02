/**
 * 
 */
package dev.atanu.design.structural.bridge;

/**
 * https://www.baeldung.com/java-bridge-pattern
 * https://www.digitalocean.com/community/tutorials/bridge-design-pattern-java
 * 
 * @author Atanu Bhowmick
 *
 */
public class BridgePatternTest {
	
	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.draw();
		
		Shape rectangle = new Rectangle(new GreenColor());
		rectangle.draw();
	}
}
