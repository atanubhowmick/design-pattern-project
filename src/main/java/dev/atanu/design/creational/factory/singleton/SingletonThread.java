/**
 * 
 */
package dev.atanu.design.creational.factory.singleton;

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
		System.out.println(this.mySingleton == mySingleton1);
	}

}
