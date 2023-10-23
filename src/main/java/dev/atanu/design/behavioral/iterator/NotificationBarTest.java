/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

import java.time.LocalDateTime;

/**
 * https://www.geeksforgeeks.org/iterator-pattern/
 * 
 * @author Atanu Bhowmick
 *
 */
public class NotificationBarTest {

	public static void main(String args[]) {
		NotificationBarTest test = new NotificationBarTest();
		NotificationBar nb = new NotificationBar(test.getNotificationCollection());
		nb.printNotifications();
	}

	private NotificationCollection getNotificationCollection() {
		NotificationCollection nc = new NotificationCollection();
		LocalDateTime now = LocalDateTime.now();
		nc.addItem("Rohit has accepted you connection request", now);
		nc.addItem("Anupam posted a question in Java-Expert group", now.minusMinutes(15));
		nc.addItem("Raju liked your post in Java-Expert group", now.minusHours(2));
		nc.addItem("Java Trainer shared a post you might be interested", now.minusHours(4).minusMinutes(10));
		return nc;
	}
}
