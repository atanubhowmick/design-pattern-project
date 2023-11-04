/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * @author Atanu Bhowmick
 * 
 */
public class UpiDetails {

	private String upiId;
	private char[] upiPin;
	private String mobileNum;

	public UpiDetails(String upiId, char[] upiPin, String mobileNum) {
		this.upiId = upiId;
		this.upiPin = upiPin;
		this.mobileNum = mobileNum;
	}

	public String getUpiId() {
		return upiId;
	}

	public char[] getUpiPin() {
		return upiPin;
	}

	public String getMobileNum() {
		return mobileNum;
	}

}
