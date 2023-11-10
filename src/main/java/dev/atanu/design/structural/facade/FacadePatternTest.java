/**
 * 
 */
package dev.atanu.design.structural.facade;

import java.util.List;

import dev.atanu.design.structural.facade.CardDetails.CardType;

/**
 * https://www.scaler.com/topics/design-patterns/facade-design-patterns/
 * 
 * @author Atanu Bhowmick
 * 
 */
public class FacadePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Operator operator = new Operator();
		
		List<Product> products = List.of(new Product(1L, "HP Pavilion Laptop", 45000.00, "14 Inch", "HP"), 
				new Product(2L, "Samsung Galaxy s7", 20000.00, "6 Inch", "Samsung"));
		CardDetails creditCard = new CardDetails(CardType.CREDIT, "Atanu", "1234567890123456", "000", "01/2030");
		DeliveryAddress address = new DeliveryAddress("A12", "AJ Street", "Kolkata", "WB", 700001);
		operator.completeOrder(products, creditCard, address);
	}

}
