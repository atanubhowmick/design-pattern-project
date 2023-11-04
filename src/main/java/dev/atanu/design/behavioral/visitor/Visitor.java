/**
 * 
 */
package dev.atanu.design.behavioral.visitor;

/**
 * @author Atanu Bhowmick
 * 
 */
public interface Visitor {

	public void visit(XmlElement xe);
	
	public void visit(JsonElement je);
	
	public void visit(YmlElement ye);
}
