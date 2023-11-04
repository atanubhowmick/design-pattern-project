/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * 
 */
public class NetBankingDetails {

	private String bankName;
	private String userId;
	private char[] password;

	public NetBankingDetails(String bankName, String userId, char[] password) {
		this.bankName = bankName;
		this.userId = userId;
		this.password = password;
	}

	public String getBankName() {
		return bankName;
	}

	public String getUserId() {
		return userId;
	}

	public char[] getPassword() {
		return password;
	}

}
