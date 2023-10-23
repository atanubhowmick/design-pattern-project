/**
 * 
 */
package dev.atanu.design.behavioral.chain.responsibility;

/**
 * @author Atanu Bhowmick
 *
 */
public interface AtmDispenseChain {

	public void setNextChain(AtmDispenseChain nextChain);

	public void dispense(Currency cur);
}
