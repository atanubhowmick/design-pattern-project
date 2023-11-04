/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * @author Atanu Bhowmick
 * 
 */
public class NetBankingPayStrategy implements PaymentStrategy {

	private NetBankingDetails netBankingDetails;

	public NetBankingPayStrategy(NetBankingDetails netBankingDetails) {
		this.netBankingDetails = netBankingDetails;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Paying " + amount + " with netbanking from " 
				+ netBankingDetails.getBankName()
				+ " Customer Id: " + netBankingDetails.getUserId());
	}

}
