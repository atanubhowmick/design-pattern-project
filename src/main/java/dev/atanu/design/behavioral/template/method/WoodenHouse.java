/**
 * 
 */
package dev.atanu.design.behavioral.template.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

}
