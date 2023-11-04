/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * https://www.digitalocean.com/community/tutorials/strategy-design-pattern-in-java-example-tutorial
 * https://refactoring.guru/design-patterns/strategy/java/example#example-0
 * 
 * @author Atanu Bhowmick
 */
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("1001", "HP Pendrive", 1200.00);
		Item item2 = new Item("1002", "Head First Java Book", 700.00);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by credit card
		CreditCard creditCard = new CreditCard("Abc Xyz", "1234567890123456", "123", "12/2030");
		cart.pay(new CreditCardPayStrategy(creditCard));

		// pay by credit card
		cart.pay(new UpiPayStrategy(new UpiDetails("xyz@ibl", "1234".toCharArray(), "9999999999")));

		// pay by credit card
		cart.pay(new NetBankingPayStrategy(new NetBankingDetails("HDFC Bank", "12345", "12345".toCharArray())));
	}
}
