/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class RealmeMobile implements Mobile {

	@Override
	public void brandName() {
		System.out.println("Realme Mobile");
	}

	@Override
	public void price() {
		System.out.println("Price : 15000 INR");
	}

}
