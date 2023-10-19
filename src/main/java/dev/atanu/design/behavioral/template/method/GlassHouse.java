/**
 * 
 */
package dev.atanu.design.behavioral.template.method;

/**
 * @author Atanu Bhowmick
 *
 */
public class GlassHouse extends HouseTemplate {

	@Override
	public void buildPillars() {
		System.out.println("Build pillers with woods");
	}

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

}
