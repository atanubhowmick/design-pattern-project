/**
 * 
 */
package dev.atanu.design.structural.composite;

/**
 * https://www.baeldung.com/java-composite-pattern
 * 
 * @author Atanu Bhowmick
 *
 */
public class CompositePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee developer1 = new Developer(1, "Atanu", "Developer");
		Employee developer2 = new Developer(2, "Dev1", "Senior Developer");
		Employee tester1 = new Tester(3, "Tester1", "Tester");
		
		Manager manager1 = new Manager(10, "Manager1", "Project Manager");
		manager1.addReportee(developer1);
		manager1.addReportee(developer2);
		manager1.addReportee(tester1);
		
		Employee developer3 = new Developer(1, "Dev3", "Senior Developer");
		Employee ba1 = new BusinessAnalyst(2, "BA1", "Senior BA");
		Employee tester2 = new Tester(3, "Tester2", "Senior Tester");
		
		Manager manager2 = new Manager(11, "Manager2", "Delivery Manager");
		manager2.addReportee(developer3);
		manager2.addReportee(ba1);
		manager2.addReportee(tester2);
		
		Manager manager3 = new Manager(12, "Director1", "Associate Director");
		manager3.addReportee(manager1);
		manager3.addReportee(manager2);
	
		// Show everyone's details
		manager3.showDetails();
	}

}
