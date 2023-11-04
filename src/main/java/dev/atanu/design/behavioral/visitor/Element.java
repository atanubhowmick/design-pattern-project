/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public interface Element {

	public void accept(Visitor visitor);
}
