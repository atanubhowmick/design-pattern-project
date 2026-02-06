/**
 * 
 */
package dev.atanu.design.behavioral.state;

import java.util.Date;

/**
 * https://www.baeldung.com/java-state-design-pattern
 * https://www.digitalocean.com/community/tutorials/state-design-pattern-java
 * 
 * @author Atanu Bhowmick
 * 
 */
public class StatePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Package pkg = new Package();
		pkg.setItemName("Dell Laptop");
		pkg.setOrderDate(new Date());
		pkg.setDeliveryAddress("#101, XYZ Street, India");

		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();

		pkg.nextState();
		pkg.printStatus();
	}

}
