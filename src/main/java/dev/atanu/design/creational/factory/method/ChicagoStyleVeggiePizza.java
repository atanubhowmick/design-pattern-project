/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		this.name = "Chicago Style Veggie Pizza";
		this.dough = "Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
