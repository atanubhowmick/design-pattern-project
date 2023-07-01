/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author ATANU
 *
 */
public class IPhone14 implements Mobile{

	@Override
	public void brandName() {
		System.out.println("IPhone v-14");
	}

	@Override
	public void price() {
		System.out.println("Price: 50000 INR");
	}

}
