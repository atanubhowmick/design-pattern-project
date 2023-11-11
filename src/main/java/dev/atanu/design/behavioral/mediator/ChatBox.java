/**
 * 
 */
package dev.atanu.design.behavioral.mediator;

/**
 * @author Atanu Bhowmick
 * 
 */
public interface ChatBox {

	public void sendMessage(String msg, User user);

	public void addUser(User user);
}
