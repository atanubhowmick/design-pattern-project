/**
 * 
 */
package dev.atanu.design.behavioral.chain.responsibility;

/**
 * @author Atanu Bhowmick
 *
 */
public class AtmWithdrawl {

	private AtmDispenseChain c1;

	public AtmWithdrawl() {
		// initialize the chain
		this.c1 = new Atm500RupeesDispenser();
		AtmDispenseChain c2 = new Atm200RupeesDispenser();
		AtmDispenseChain c3 = new Atm100RupeesDispenser();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public void withdraw(int amount) {
		if (amount % 100 != 0) {
			throw new IllegalArgumentException("Withdrawl amount must be a multiple of 100");
		}

		c1.dispense(new Currency(amount));
	}
}
