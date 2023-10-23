/**
 * 
 */
package dev.atanu.design.behavioral.iterator;

import java.time.LocalDateTime;

/**
 * @author Atanu Bhowmick
 *
 */
public class Notification {

	private String notificationMsg;
	private LocalDateTime receivingTimestamp;

	public Notification(String notificationMsg, LocalDateTime receivingTimestamp) {
		this.notificationMsg = notificationMsg;
		this.receivingTimestamp = receivingTimestamp;
	}

	public String getNotificationMsg() {
		return notificationMsg;
	}

	public LocalDateTime getReceivingTimestamp() {
		return receivingTimestamp;
	}

}
