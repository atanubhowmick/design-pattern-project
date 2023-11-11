/**
 * 
 */
package dev.atanu.design.behavioral.mediator;

/**
 * @author Atanu Bhowmick
 * 
 */
public class UserImpl extends User {

	public UserImpl(ChatBox chatBox, String name) {
		super(chatBox, name);
	}

	@Override
	public void send(String msg) {
		System.out.println("[Sent] " + this.name + " : " + msg);
		this.chatBox.sendMessage(msg, this);
	}

	@Override
	public void receive(String msg) {
		System.out.println("[Received] " + this.name + " : " + msg);
	}

}
