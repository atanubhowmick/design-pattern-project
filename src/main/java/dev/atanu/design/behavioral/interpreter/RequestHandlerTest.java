/**
 * 
 */
package dev.atanu.design.behavioral.interpreter;

/**
 * https://www.geeksforgeeks.org/intercepting-filter-pattern/
 * 
 * @author Atanu Bhowmick
 * 
 */
public class RequestHandlerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
 
        RequestHandler httpRequestHandler = new RequestHandler();
        httpRequestHandler.setFilterManager(filterManager);
        httpRequestHandler.handleRequest("Download File");
	}

}
