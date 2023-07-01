/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		if (item.equals("chicken")) {
			pizza = new NYStyleChickenPizza();
		} else if (item.equals("veggie")) {
			pizza = new NYStyleVeggiePizza();
		} 
		return pizza;
	}
}
