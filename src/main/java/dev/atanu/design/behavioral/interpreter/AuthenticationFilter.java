/**
 * 
 */
package dev.atanu.design.behavioral.interpreter;

/**
 * @author Atanu Bhowmick
 * 
 */
public class AuthenticationFilter implements Filter{

	@Override
	public void doFilter(String request) {
		System.out.println("Authenticating request: " + request);		
	}
}
