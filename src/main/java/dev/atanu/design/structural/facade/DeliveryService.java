/**
 * 
 */
package dev.atanu.design.structural.facade;

/**
 * @author Atanu Bhowmick
 * 
 */
public class DeliveryService {

	private DeliveryAddress address;

	public void deliver(DeliveryAddress address) {
		shipping();
		System.out.println("Order sent to currier");
		outForDelivery();
	}
	
	private void shipping() {
		System.out.println("Shipping products");
	}
	
	private void outForDelivery() {
		System.out.println("The products are out for delivery");
	}

	public DeliveryAddress getAddress() {
		return address;
	}

}
