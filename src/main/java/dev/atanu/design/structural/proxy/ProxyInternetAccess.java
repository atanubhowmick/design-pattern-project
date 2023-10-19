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
	private RealInternetAccess realAccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realAccess = new RealInternetAccess(employeeName);
			realAccess.grantInternetAccess();
		} else {
			System.out.println("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String empName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 9;
	}
}
