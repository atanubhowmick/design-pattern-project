/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * 
 */
public class UpiPayStrategy implements PaymentStrategy {

	private UpiDetails upiDetails;

	public UpiPayStrategy(UpiDetails upiDetails) {
		this.upiDetails = upiDetails;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paying " + amount + " using UPI from " + upiDetails.getUpiId());
	}

}
