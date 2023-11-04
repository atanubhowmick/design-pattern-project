/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public class JsonElement implements Element {

	private String value;
	private JsonElement child;
	private JsonElement next;

	public JsonElement(String value) {
		this.value = value;
	}

	public JsonElement(String value, JsonElement child, JsonElement next) {
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

	public JsonElement getChild() {
		return child;
	}

	public void setChild(JsonElement child) {
		this.child = child;
	}

	public JsonElement getNext() {
		return next;
	}

	public void setNext(JsonElement next) {
		this.next = next;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
