/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class IPhone15 implements Mobile{

	@Override
	public void brandName() {
		System.out.println("IPhone v-15");
	}

	@Override
	public void price() {
		System.out.println("Price: 100000 INR");
	}

}
