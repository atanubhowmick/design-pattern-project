/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

import java.time.LocalDateTime;

/**
 * @author Atanu Bhowmick
 *
 */
public class NotificationCollection implements Collection {

	private static final int MAX_ITEMS = 100;

	private int currentPosition = 0;
	private Notification[] notifications;

	@Override
	public Iterator createIterator() {
		return new NotificationIterator(notifications);
	}

	public NotificationCollection() {
		notifications = new Notification[MAX_ITEMS];
	}

	public void addItem(String message, LocalDateTime timestamp) {
		Notification notification = new Notification(message, timestamp);
		if (currentPosition >= MAX_ITEMS) {
			throw new ArrayIndexOutOfBoundsException(currentPosition);
		} else {
			notifications[currentPosition++] = notification;
		}
	}
}
