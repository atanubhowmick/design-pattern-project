/**
 * 
 */
package dev.atanu.design.structural.proxy;

/**
 * @author Atanu Bhowmick
 *
 */
public class RealInternetAccess implements InternetAccess {

	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public boolean grantInternetAccess() {
		System.out.println("Internet Access granted for employee: " + employeeName);
		return true;
	}
}
