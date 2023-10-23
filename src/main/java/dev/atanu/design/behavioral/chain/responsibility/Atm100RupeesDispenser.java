/**
 * 
 */
package dev.atanu.design.behavioral.chain.responsibility;

/**
 * @author Atanu Bhowmick
 *
 */
public class Atm100RupeesDispenser implements AtmDispenseChain {

	private AtmDispenseChain chain;

	private static final int AMOUNT = 100;

	@Override
	public void setNextChain(AtmDispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if (currency.getAmount() >= AMOUNT) {
			int num = currency.getAmount() / AMOUNT;
			int remainder = currency.getAmount() % AMOUNT;
			System.out.println("Dispensing " + num + " of " + AMOUNT + " rupees note");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		} else {
			throw new IllegalArgumentException("Invalid amount: " + AMOUNT);
		}
	}
}
