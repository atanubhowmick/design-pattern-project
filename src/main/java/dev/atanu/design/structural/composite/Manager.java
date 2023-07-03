/**
 * 
 */
package dev.atanu.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atanu Bhowmick
 *
 */
public class Manager implements Employee {

	private int empId;
	private String name;
	private String position;

	private List<Employee> reportees;

	public Manager(int empId, String name, String position) {
		this.empId = empId;
		this.name = name;
		this.position = position;
		this.reportees = new ArrayList<>();
	}

	@Override
	public void showDetails() {
		System.out.println("\n[id = " + empId + ", name = " + name + ", position = " + position + "]");
		reportees.stream().forEach(Employee::showDetails);
	}

	public void addReportee(Employee reportee) {
		this.reportees.add(reportee);
	}

	public void removeReportee(Employee reportee) {
		if (reportees.contains(reportee)) {
			this.reportees.remove(reportee);
		}
	}
}
