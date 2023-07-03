/**
 * 
 */
package dev.atanu.design.structural.composite;

/**
 * @author Atanu Bhowmick
 *
 */
public class Tester implements Employee {

	private int empId;
	private String name;
	private String position;

	public Tester(int empId, String name, String position) {
		this.empId = empId;
		this.name = name;
		this.position = position;
	}

	@Override
	public void showDetails() {
		System.out.println("[id = " + empId + ", name = " + name + ", position = " + position + "]");
	}

}
