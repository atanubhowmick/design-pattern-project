/**
 * 
 */
package dev.atanu.design.creational.prototype;

/**
 * @author Atanu Bhowmick
 *
 */
public class StudentRecord implements Prototype {

	private int id;
	private int rollNo;
	private String name;
	private StudentAddress address;

	public StudentRecord() {
		// Default Constructor
	}

	public StudentRecord(int id, int rollNo, String name, StudentAddress address) {
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public StudentAddress getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(StudentAddress address) {
		this.address = address;
	}

	@Override
	public StudentRecord getClone() {
		return new StudentRecord(id, rollNo, name, address.getClone());
	}

	@Override
	public String display() {
		return "["
				+ "id: " + id 
				+ ", rollNo: " + rollNo 
				+ ", name: " + name 
				+ ", address: " + address.display() 
				+ "]";
	}

}
