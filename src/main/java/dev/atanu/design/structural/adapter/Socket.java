/**
 * 
 */
package dev.atanu.design.structural.adapter;

/**
 * @author Atanu Bhowmick
 *
 */
public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}

}
