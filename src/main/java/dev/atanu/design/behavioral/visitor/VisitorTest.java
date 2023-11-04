/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.baeldung.com/java-visitor-pattern
 * https://www.javatpoint.com/visitor-design-pattern-java
 * 
 * @author Atanu Bhowmick
 * 
 */
public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Element> list = new ArrayList<>();
		list.add(new XmlElement("5", new XmlElement("10"), new XmlElement("25")));
		list.add(new JsonElement("rootJson", new JsonElement("17"), new JsonElement("24")));
		list.add(new YmlElement("yml 100"));
		
		Visitor visitor = new ElementVisitor();
		visit(list, visitor);
	}

	private static void visit(List<Element> elements, Visitor visitor) {
		
		for(Element element: elements) {
			element.accept(visitor);
		}
	}
}
