/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class SamsungMobile implements Mobile {

	@Override
	public void brandName() {
		System.out.println("Samsung Mobile");
	}

	@Override
	public void price() {
		System.out.println("Price : 20000 INR");
	}

}
