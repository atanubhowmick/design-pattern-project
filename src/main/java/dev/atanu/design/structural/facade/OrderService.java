/**
 * 
 */
package dev.atanu.design.structural.facade;

import java.util.List;

/**
 * @author Atanu Bhowmick
 * 
 */
public class OrderService {

	private List<Product> products;

	public double createOrder(List<Product> products) {
		System.out.println("Order created");
		return products.stream().map(Product::getProductPrice).mapToDouble(d -> d).sum();
	}

	public List<Product> getProducts() {
		return products;
	}

}
