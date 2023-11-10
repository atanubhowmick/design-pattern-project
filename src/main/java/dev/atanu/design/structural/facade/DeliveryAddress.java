/**
 * 
 */
package dev.atanu.design.structural.facade;

/**
 * @author Atanu Bhowmick
 *
 */
public class DeliveryAddress {

	private String houseNum;
	private String locality;
	private String city;
	private String state;
	private int pinCode;

	public DeliveryAddress() {
		// Default constructor
	}

	public DeliveryAddress(String houseNum, String locality, String city, String state, int pinCode) {
		this.houseNum = houseNum;
		this.locality = locality;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	/**
	 * @return the houseNum
	 */
	public String getHouseNum() {
		return houseNum;
	}

	/**
	 * @param houseNum the houseNum to set
	 */
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	/**
	 * @return the locality
	 */
	public String getLocality() {
		return locality;
	}

	/**
	 * @param locality the locality to set
	 */
	public void setLocality(String locality) {
		this.locality = locality;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}

	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String display() {
		return "[" + "houseNum: " + houseNum + ", locality: " + locality + ", city:" + city + ", state: " + state
				+ ", pin: " + pinCode + "]";
	}
}
