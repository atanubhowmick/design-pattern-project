/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class MotorolaMobile implements Mobile {

	@Override
	public void brandName() {
		System.out.println("Motorola Mobile");
	}

	@Override
	public void price() {
		System.out.println("Price : 25000 INR");
	}

}
