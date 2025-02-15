/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public interface FileReceiver {

	public String open();

	public String read();

	public String write();

	public String save();

	public void close();
}
