/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class IPhoneMobileFactory implements AbstractFactory {

	@Override
	public Mobile getMobile(String mobileModel) {
		Mobile mobile = null;
		if (mobileModel.equalsIgnoreCase("14")) {
			mobile = new IPhone14();
		} else if (mobileModel.equalsIgnoreCase("15")) {
			mobile = new IPhone15();
		}
		return mobile;
	}

}
