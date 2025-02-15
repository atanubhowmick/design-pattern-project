/**
 * 
 */
package dev.atanu.design.creational.singleton;

import java.io.Serializable;

/**
 * There are four ways to break the singleton design.
 * <ul>
 *   <li> Instantiate through reflection
 *   <li> Multiple threads trying to instantiate simultaneously 
 *   <li> Serialization and then de-serialization the object
 *   <li> By cloning the object
 * </ul>
 * 
 * Each of the possibilities are prevented by the below implementation.
 * 
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
	 * This is a helper class to instantiate of the {@link MySingleton} class. 
	 * As this is a static class, would be loaded to memory only once. But this
	 * is a nested class, so it won't be loaded until called via parent class.
	 * 
	 * @author Atanu Bhowmick
	 *
	 */
	private static final class SingletonHelper {
		private static final MySingleton INSTANCE = new MySingleton();
	}
}
