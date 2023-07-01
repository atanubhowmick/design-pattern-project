/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza() {
		this.name = "NY Style Veggie Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Grated Reggiano Cheese");
	}
}
