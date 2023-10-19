/**
 * 
 */
package dev.atanu.design.behavioral.template.method;

/**
 * @author Atanu Bhowmick
 *
 */
public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	// methods to be implemented by subclasses
	public abstract void buildPillars();
	public abstract void buildWalls();
	
	private void buildFoundation() {
		System.out.println("Building foundation with cement, iron rods and sand");
	}
	
	// default implementation
	private void buildWindows() {
		System.out.println("Building Glass Windows");
	}

}
