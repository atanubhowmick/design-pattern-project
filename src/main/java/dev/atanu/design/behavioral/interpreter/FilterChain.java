/**
 * 
 */
package dev.atanu.design.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atanu Bhowmick
 * 
 */
public class FilterChain {

	private List<Filter> filters;
	private Target target;

	public FilterChain() {
		filters = new ArrayList<Filter>();
	}

	public void addFilter(Filter filter) {
		filters.add(filter);
	}

	public void execute(String request) {
		for (Filter filter : filters) {
			filter.doFilter(request);
		}
		target.execute(request);
	}

	public void setTarget(Target target) {
		this.target = target;
	}
}
