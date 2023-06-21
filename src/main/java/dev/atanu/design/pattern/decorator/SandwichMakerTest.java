/**
 * 
 */
package dev.atanu.design.pattern.decorator;

/**
 * @author Atanu Bhowmick
 *
 */
public class SandwichMakerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich sandwich = new ChickenSandwich();
		System.out.println(sandwich);
		sandwich = new CheeseDecorator(sandwich);
		System.out.println(sandwich);
		sandwich = new SaladDecorator(sandwich);
		System.out.println(sandwich);
		
		System.out.println("----- Creating another -----");
		
		Sandwich vegSandwich = new VegSandwich();
		System.out.println(vegSandwich);
		sandwich = new SaladDecorator(vegSandwich);
		System.out.println(sandwich);
	}

}
