/**
 * 
 */
package dev.atanu.design.structural.facade;

/**
 * @author Atanu Bhowmick
 * 
 */
public class Product {

	private Long productId;
	private String productName;
	private Double productPrice;
	private String productSize;
	private String brandName;

	public Product() {
		// No-arg constructor
	}

	public Product(Long productId, String productName, Double productPrice, String productSize, String brandName) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productSize = productSize;
		this.brandName = brandName;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
