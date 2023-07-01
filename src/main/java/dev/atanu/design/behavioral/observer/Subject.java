/**
 * 
 */
package dev.atanu.design.behavioral.observer;

/**
 * @author Atanu Bhowmick
 *
 */
public interface Subject {

	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyObservers();

}
