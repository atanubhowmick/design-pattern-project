/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

/**
 * @author Atanu Bhowmick
 *
 */
public class NotificationIterator implements Iterator {

	private Notification[] notifications;

	private int currentIndex = 0;

	public NotificationIterator(Notification[] notifications) {
		this.notifications = notifications;
	}

	@Override
	public boolean hasNext() {
		if (currentIndex < notifications.length && notifications[currentIndex] != null) {
			return true;
		}
		return false;
	}

	@Override
	public Object getNext() {
		return notifications[currentIndex++];
	}

}
