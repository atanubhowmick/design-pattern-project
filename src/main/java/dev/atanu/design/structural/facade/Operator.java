/**
 * 
 */
package dev.atanu.design.structural.facade;

import java.util.List;

/**
 * @author Atanu Bhowmick
 * 
 */
public class Operator {

	private OrderService orderService;
	private PaymentService paymentService;
	private DeliveryService deliveryService;

	public Operator() {
		this.orderService = new OrderService();
		this.paymentService = new PaymentService();
		this.deliveryService = new DeliveryService();
	}

	public void completeOrder(List<Product> products, CardDetails cardDetails, DeliveryAddress address) {
		double amount = orderService.createOrder(products);
		boolean isPaymentSuccess = paymentService.makePayment(amount, cardDetails);
		if(isPaymentSuccess) {
			deliveryService.deliver(address);
		}
	}
}
