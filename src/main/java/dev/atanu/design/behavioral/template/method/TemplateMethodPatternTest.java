/**
 * 
 */
package dev.atanu.design.behavioral.template.method;

/**
 * https://www.digitalocean.com/community/tutorials/template-method-design-pattern-in-java
 * 
 * @author Atanu Bhowmick
 *
 */
public class TemplateMethodPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		houseType.buildHouse();
		
		System.out.println("************");

		houseType = new GlassHouse();
		houseType.buildHouse();
	}

}
