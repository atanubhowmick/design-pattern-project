/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public class XmlElement implements Element {

	private String value;
	private XmlElement child;
	private XmlElement next;

	public XmlElement(String value) {
		this.value = value;
	}

	public XmlElement(String value, XmlElement child, XmlElement next) {
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

	public XmlElement getChild() {
		return child;
	}

	public void setChild(XmlElement child) {
		this.child = child;
	}

	public XmlElement getNext() {
		return next;
	}

	public void setNext(XmlElement next) {
		this.next = next;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
