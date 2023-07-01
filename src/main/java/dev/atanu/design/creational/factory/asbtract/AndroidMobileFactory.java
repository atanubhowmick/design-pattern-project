/**
 * 
 */
package dev.atanu.design.creational.factory.asbtract;

/**
 * @author Atanu Bhowmick
 *
 */
public class AndroidMobileFactory implements AbstractFactory {

	@Override
	public Mobile getMobile(String mobileModel) {
		Mobile mobile = null;
		if (mobileModel.equalsIgnoreCase("Motorola")) {
			mobile = new MotorolaMobile();
		} else if (mobileModel.equalsIgnoreCase("Samsung")) {
			mobile = new SamsungMobile();
		} else if (mobileModel.equalsIgnoreCase("Lava")) {
			mobile = new RealmeMobile();
		}
		return mobile;
	}

}
