/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public class YmlElement implements Element {

	private String value;
	private YmlElement child;
	private YmlElement next;

	public YmlElement(String value) {
		this.value = value;
	}

	public YmlElement(String value, YmlElement child, YmlElement next) {
		this.value = value;
		this.child = child;
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public YmlElement getChild() {
		return child;
	}

	public void setChild(YmlElement child) {
		this.child = child;
	}

	public YmlElement getNext() {
		return next;
	}

	public void setNext(YmlElement next) {
		this.next = next;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
