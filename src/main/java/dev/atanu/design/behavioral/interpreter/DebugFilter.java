/**
 * 
 */
package dev.atanu.design.behavioral.interpreter;

/**
 * @author Atanu Bhowmick
 * 
 */
public class DebugFilter implements Filter{

	@Override
	public void doFilter(String request) {
		System.out.println("Logging request : " + request);		
	}

}
