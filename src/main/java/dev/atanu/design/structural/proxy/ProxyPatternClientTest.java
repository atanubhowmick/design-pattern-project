/**
 * 
 */
package dev.atanu.design.structural.proxy;

/**
 * https://www.javatpoint.com/proxy-pattern
 * 
 * @author Atanu Bhowmick
 *
 */
public class ProxyPatternClientTest {

	public static void main(String[] args) {
		InternetAccess access = new ProxyInternetAccess("Ashwin Rajput");
		access.grantInternetAccess();
	}
}
