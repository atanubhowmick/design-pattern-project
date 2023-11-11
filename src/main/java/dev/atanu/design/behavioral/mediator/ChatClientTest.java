/**
 * 
 */
package dev.atanu.design.behavioral.mediator;

/**
 * https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 * 
 * @author Atanu Bhowmick
 * 
 */
public class ChatClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChatBox mediator = new ChatBoxImpl();
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		user2.send("Hello. How are you?");
		user3.send("Good morning!");
	}

}
