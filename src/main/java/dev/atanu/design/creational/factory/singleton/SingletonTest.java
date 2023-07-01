/**
 * 
 */
package dev.atanu.design.creational.factory.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * @author Atanu Bhowmick
 *
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MySingleton mySingleton = MySingleton.getInstance();
		
		testReflection(mySingleton);
		
		testCloning(mySingleton);
		
		testSerilizationAndDeserilization(mySingleton);
		
		testMultiThreading(mySingleton);
	}
	
	private static void testReflection(MySingleton mySingleton) {
		System.out.println("Trying to create another instance using reflection");
		try {
			String className = "dev.atanu.design.creational.factory.singleton.MySingleton";
			Class<?> clazz = Class.forName(className);
			Constructor<?>[] constructors = clazz.getDeclaredConstructors();
			Constructor<?> constructor = constructors[1];
			constructor.setAccessible(true);

			// Should throw IllegalStateException("Singleton class can't be instantiated more than once")
			MySingleton mySingleton1 = (MySingleton) constructor.newInstance();
			boolean isSameInstance = mySingleton == mySingleton1;
			System.out.println("Instances are equal : " + isSameInstance);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testCloning(MySingleton mySingleton) {
		System.out.println("\nTrying to create another instance using cloning");
		try {
			// Should throw CloneNotSupportedException("Singleton class can't be cloned")
			mySingleton.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testSerilizationAndDeserilization(MySingleton mySingleton) {
		String filePath = "E:\\Test\\FileTest\\obj.txt";
		System.out.println("\nTrying serilization & deserilization to validate the instance creation");
		try(FileOutputStream fileOutputStream = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);) {
			out.writeObject(mySingleton);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fileInputStream = new FileInputStream(filePath);
				ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);) {
			Object obj = inputStream.readObject();
			if(obj instanceof MySingleton) {
				System.out.println("Deserilize successful");
				MySingleton mySingleton2 = (MySingleton) obj;
				boolean isSameObject = mySingleton == mySingleton2;
				System.out.println("Same instance returned: " + isSameObject);
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void testMultiThreading(MySingleton mySingleton) {
		System.out.println("\nTrying multi threading to validate the instance creation");
		System.out.println("All Validation should be true");
		for(int i = 1; i <= 100; i++) {
			new Thread(new SingletonThread(mySingleton), "T" + i).start();
		}
	}

}
