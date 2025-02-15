/**
 * 
 */
package dev.atanu.design.creational.singleton;

/**
 * @author Atanu Bhowmick
 *
 */
public class SingletonThread implements Runnable {

	private MySingleton mySingleton;

	public SingletonThread(MySingleton mySingleton) {
		this.mySingleton = mySingleton;
	}

	@Override
	public void run() {
		MySingleton mySingleton1 = MySingleton.getInstance();
		boolean sameInstance = this.mySingleton == mySingleton1;
		System.out.println(Thread.currentThread().getName() + " is same instance: " + sameInstance);
	}

}
