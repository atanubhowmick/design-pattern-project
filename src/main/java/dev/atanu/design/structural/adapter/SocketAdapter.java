/**
 * 
 */
package dev.atanu.design.structural.adapter;

/**
 * @author Atanu Bhowmick
 *
 */
public interface SocketAdapter {

	public Volt get120Volt();

	public Volt get12Volt();

	public Volt get3Volt();
}
