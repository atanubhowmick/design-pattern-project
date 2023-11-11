/**
 * 
 */
package dev.atanu.design.behavioral.mediator;

/**
 * @author Atanu Bhowmick
 * 
 */
public abstract class User {

	protected ChatBox chatBox;
	protected String name;

	public User(ChatBox chatBox, String name) {
		this.chatBox = chatBox;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);
}
