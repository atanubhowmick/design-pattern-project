/**
 * 
 */
package dev.atanu.design.behavioral.state;

/**
 * @author Atanu Bhowmick
 * 
 */
public interface State {

	public void next(Package pkg);
	
	public void prev(Package pkg);
	
	public void printStatus();
}
