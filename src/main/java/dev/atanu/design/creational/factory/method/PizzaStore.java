/**
 * 
 */
package dev.atanu.design.creational.factory.method;

/**
 * @author Atanu Bhowmick
 *
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

	protected abstract Pizza createPizza(String type);
}
