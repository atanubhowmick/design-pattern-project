/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		if (item.equals("chicken")) {
			pizza = new ChicagoStyleChickenPizza();
		} else if (item.equals("veggie")) {
			pizza = new ChicagoStyleVeggiePizza();
		} 
		return pizza;
	}
}
