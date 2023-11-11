/**
 * 
 */
package dev.atanu.design.behavioral.interpreter;

/**
 * @author Atanu Bhowmick
 * 
 */
public class RequestHandler {

	private FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;

	}

	public void handleRequest(String request) {
		filterManager.filterRequest(request);
		// do other staff
	}
}
