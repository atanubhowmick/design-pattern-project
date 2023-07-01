/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class NYStyleChickenPizza extends Pizza {
	
	public NYStyleChickenPizza() {
		this.name = "NY Style Sauce and Chicken Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		this.toppings.add("Grated Reggiano Cheese");
	}
}
