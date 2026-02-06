/**
 * 
 */
package dev.atanu.design.behavioral.state;

import java.util.Date;

/**
 * @author Atanu Bhowmick
 * 
 */
public class Package {

	private String itemName;
	private Date orderDate;
	private String deliveryAddress;

	private State state = new OrderedState();

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public void previousState() {
		state.prev(this);
	}

	public void nextState() {
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
