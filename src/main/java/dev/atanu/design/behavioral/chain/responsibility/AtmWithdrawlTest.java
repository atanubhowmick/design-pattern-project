/**
 * 
 */
package dev.atanu.design.behavioral.chain.responsibility;

/**
 * https://www.digitalocean.com/community/tutorials/chain-of-responsibility-design-pattern-in-java
 * 
 * @author Atanu Bhowmick
 *
 */
public class AtmWithdrawlTest {

	public static void main(String[] args) {
		AtmWithdrawl atmWithdrawl = new AtmWithdrawl();
		
		System.out.println("---- First Withdrawl ----");
		atmWithdrawl.withdraw(2500);
		
		System.out.println("---- Second Withdrawl ----");
		atmWithdrawl.withdraw(1800);
		
		System.out.println("---- Third Withdrawl ----");
		atmWithdrawl.withdraw(2250);
	}

}
