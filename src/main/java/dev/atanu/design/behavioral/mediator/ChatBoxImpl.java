/**
 * 
 */
package dev.atanu.design.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atanu Bhowmick
 * 
 */
public class ChatBoxImpl implements ChatBox {

	private List<User> users;

	public ChatBoxImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User sender) {
		for (User u : this.users) {
			// message should not be received by the user sending it
			if (u != sender) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
