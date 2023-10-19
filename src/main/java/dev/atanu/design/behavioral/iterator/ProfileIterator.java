/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

/**
 * @author Atanu Bhowmick
 *
 */
public interface ProfileIterator {

	public boolean hasNext();

	public MyCollection getNext();

	public void reset();
}
