/**
 * 
 */
package dev.atanu.design.behavioral.chain.responsibility;

/**
 * @author Atanu Bhowmick
 *
 */
public class Currency {

	private int amount;

	public Currency(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return this.amount;
	}
}
