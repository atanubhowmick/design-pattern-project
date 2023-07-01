/**
 * 
 */
package dev.atanu.design.creational.singleton;

import java.io.Serializable;

/**
 * @author Atanu Bhowmick
 *
 */
public class MySingleton implements Cloneable, Serializable {

	private static final long serialVersionUID = -5754920445679992251L;

	private MySingleton() {
		MySingleton mySingleton = getInstance();
		if (mySingleton != null) {
			throw new IllegalStateException("Singleton class can't be instantiated more than once");
		}
	}

	public static MySingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton class can't be cloned");
	}

	/**
	 * Static nested class
	 * 
	 * @author Atanu Bhowmick
	 *
	 */
	private static final class SingletonHelper {
		private static final MySingleton INSTANCE = new MySingleton();
	}
}
