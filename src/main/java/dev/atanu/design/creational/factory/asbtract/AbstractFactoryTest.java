/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractFactory androidFactory = FactoryProvider.getFactory("Android");
		Mobile onePlus = androidFactory.getMobile("Motorola");
		onePlus.brandName();
		onePlus.price();
		
		Mobile samsang = androidFactory.getMobile("Samsung");
		samsang.brandName();
		samsang.price();
		
		AbstractFactory iphoneFactory = FactoryProvider.getFactory("IPhone");
		Mobile iphone14 = iphoneFactory.getMobile("14");
		iphone14.brandName();
		iphone14.price();
		
		Mobile iphone15 = iphoneFactory.getMobile("15");
		iphone15.brandName();
		iphone15.price();
	}

}
