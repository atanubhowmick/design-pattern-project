/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * The Factory Method creates objects through inheritance where the 
 * Abstract Factory creates objects through composition.
 * 
 * @author Atanu Bhowmick
 *
 */
public class FactoryProvider {

	public static AbstractFactory getFactory(String type) {
		if (type.equalsIgnoreCase("Android")) {
			return new AndroidMobileFactory();
		} else if (type.equalsIgnoreCase("IPhone")) {
			return new IPhoneMobileFactory();
		}
		return null;
	}
}
