/**
 * 
 */
package dev.atanu.design.creational.prototype;

/**
 * https://www.javatpoint.com/prototype-design-pattern
 * 
 * @author Atanu Bhowmick
 *
 */
public class PrototypeTest {

	public static void main(String[] args) {
		StudentRecord student = new StudentRecord();
		student.setId(2501);
		student.setRollNo(20);
		student.setName("Sumon Roy");

		StudentAddress address = new StudentAddress();
		address.setHouseNum("N100");
		address.setLocality("Sukanta Nagar, Salt Lake");
		address.setCity("Kolkata");
		address.setState("West bengal");
		address.setPinCode(700098);

		student.setAddress(address);

		System.out.println(student.display());

		StudentRecord clonedStudent = student.getClone();
		System.out.println(clonedStudent.display());

		System.out.println("Is same object: " + (student == clonedStudent));
		System.out.println(student);
		System.out.println(clonedStudent);

	}
}
