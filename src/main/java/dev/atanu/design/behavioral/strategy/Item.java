/**
 * 
 */
package dev.atanu.design.behavioral.strategy;

/**
 * 
 */
public class Item {

	private String itemCode;
	private String itemName;
	private double price;

	public Item() {
		// Default Constructor
	}

	public Item(String itemCode, String itemName, double price) {
		this.itemCode = itemCode;
		this.setItemName(itemName);
		this.price = price;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
