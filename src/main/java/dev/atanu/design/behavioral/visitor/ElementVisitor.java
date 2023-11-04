/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public class ElementVisitor implements Visitor {

	@Override
	public void visit(XmlElement xe) {
		System.out.println("Visiting XML Element");
		System.out.println(xe.getValue());

		// Visit child
		visitChild(xe);

		// Visit next element
		XmlElement next = xe.getNext();
		while (next != null) {
			System.out.println(next.getValue());
			visitChild(xe.getChild());
			next = next.getNext();
		}
	}

	@Override
	public void visit(JsonElement je) {
		System.out.println("Visiting JSON Element");
		
		System.out.println(je.getValue());

		// Visit child
		visitChild(je);

		// Visit next element
		JsonElement next = je.getNext();
		while (next != null) {
			System.out.println(next.getValue());
			visitChild(je.getChild());
			next = next.getNext();
		}
	}

	@Override
	public void visit(YmlElement ye) {
		System.out.println("Visiting YML Element");
		
		System.out.println(ye.getValue());

		// Visit child
		visitChild(ye);

		// Visit next element
		YmlElement next = ye.getNext();
		while (next != null) {
			System.out.println(next.getValue());
			visitChild(ye.getChild());
			next = next.getNext();
		}
	}

	private void visitChild(XmlElement xe) {
		XmlElement child = xe.getChild();
		while (child != null) {
			System.out.println(child.getValue());
			child = child.getNext();
		}
	}

	private void visitChild(JsonElement je) {
		JsonElement child = je.getChild();
		while (child != null) {
			System.out.println(child.getValue());
			child = child.getNext();
		}
	}

	private void visitChild(YmlElement ye) {
		YmlElement child = ye.getChild();
		while (child != null) {
			System.out.println(child.getValue());
			child = child.getNext();
		}
	}
}
