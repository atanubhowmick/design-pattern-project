/**
 * 
 */
package dev.atanu.design.pattern.observer;

/**
 * @author Atanu Bhowmick
 *
 */
public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}
