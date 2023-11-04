/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * @author Atanu Bhowmick
 * 
 */
public class CreditCard {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getName() {
		return name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

}
