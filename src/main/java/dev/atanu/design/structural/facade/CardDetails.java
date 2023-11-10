/**
 * 
 */
package dev.atanu.design.structural.facade;

/**
 * @author Atanu Bhowmick
 * 
 */
public class CardDetails {

	private CardType cardType;
	private String payeeName;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CardDetails(CardType cardType, String payeeName, String cardNumber, String cvv, String dateOfExpiry) {
		this.cardType = cardType;
		this.payeeName = payeeName;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getPayeeName() {
		return payeeName;
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
	

	public enum CardType {
		DEBIT,
		CREDIT
	}
}
