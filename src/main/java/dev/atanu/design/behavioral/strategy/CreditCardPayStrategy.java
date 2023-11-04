/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * 
 */
public class CreditCardPayStrategy implements PaymentStrategy {

	private CreditCard creditCard;

	public CreditCardPayStrategy(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paying " + amount + " through credit card ending " 
				+ creditCard.getCardNumber().substring(12));
	}

}
