/**
 * 
 */
package dev.atanu.design.structural.proxy;

/**
 * @author Atanu Bhowmick
 *
 */
public class ProxyInternetAccess implements InternetAccess {

	private String employeeName;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public boolean grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			InternetAccess realAccess = new RealInternetAccess(employeeName);
			return realAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
			return false;
		}
	}

	public int getRole(String empName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 9;
	}
}
