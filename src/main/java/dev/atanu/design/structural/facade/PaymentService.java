/**
 * 
 */
package dev.atanu.design.structural.facade;

/**
 * @author Atanu Bhowmick
 * 
 */
public class PaymentService {

	public boolean makePayment(double amount, CardDetails cardDetails) {
		System.out.println("Making payment of " + amount);
		return completePayment(amount, cardDetails);
	}

	private boolean completePayment(double amount, CardDetails cardDetails) {
		System.out.println("Calling payment gateway..");
		// Code to call payment gateway
		System.out.println("Payment done with " + cardDetails.getCardType() + " ends with "
				+ cardDetails.getCardNumber().substring(12));
		return true;
	}

}
