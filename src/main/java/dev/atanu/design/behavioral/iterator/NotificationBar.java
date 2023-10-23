/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

/**
 * @author Atanu Bhowmick
 *
 */
public class NotificationBar {

	private NotificationCollection collection;

	public NotificationBar(NotificationCollection collection) {
		this.collection = collection;
	}

	public void printNotifications() {
		Iterator iterator = collection.createIterator();
		System.out.println("-------NOTIFICATION BAR------------");
		while (iterator.hasNext()) {
			Notification n = (Notification) iterator.getNext();
			System.out.println(n.getReceivingTimestamp() + " " + n.getNotificationMsg());
		}
	}
}
