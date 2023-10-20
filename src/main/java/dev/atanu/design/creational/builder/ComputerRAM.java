/**
 * 
 */
package dev.atanu.design.creational.builder;

/**
 * @author Atanu Bhowmick
 *
 */
public class ComputerRAM {

	private String manufacturer;
	private String name;
	private String size;
	private String type;

	private ComputerRAM(RAMBuilder builder) {
		this.manufacturer = builder.manufacturer;
		this.name = builder.name;
		this.size = builder.size;
		this.type = builder.type;
	}

	public static RAMBuilder builder() {
		return new RAMBuilder();
	}

	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "[" 
				+ "manufacturer: " + manufacturer 
				+ ", name: " + name 
				+ ", size:" + size 
				+ ", type: " + type
				+ "]";
	}

	public static class RAMBuilder {

		private String manufacturer;
		private String name;
		private String size;
		private String type;

		/**
		 * @param manufacturer the manufacturer to set
		 */
		public RAMBuilder setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}

		/**
		 * @param name the name to set
		 */
		public RAMBuilder setName(String name) {
			this.name = name;
			return this;
		}

		/**
		 * @param size the size to set
		 */
		public RAMBuilder setSize(String size) {
			this.size = size;
			return this;
		}

		/**
		 * @param type the type to set
		 */
		public RAMBuilder setType(String type) {
			this.type = type;
			return this;
		}

		public ComputerRAM build() {
			return new ComputerRAM(this);
		}
	}
}
