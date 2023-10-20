/**
 * 
 */
package dev.atanu.design.creational.builder;

/**
 * @author Atanu Bhowmick
 *
 */
public class ComputerProcessor {

	private String manufacturer;
	private String name;
	private String operatingFrequency;
	private String maximumFrequency;
	private String powerConsumption;

	private ComputerProcessor(ProcessorBuilder builder) {
		this.manufacturer = builder.manufacturer;
		this.name = builder.name;
		this.operatingFrequency = builder.operatingFrequency;
		this.maximumFrequency = builder.maximumFrequency;
		this.powerConsumption = builder.powerConsumption;
	}

	public static ProcessorBuilder builder() {
		return new ProcessorBuilder();
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
	 * @return the operatingFrequency
	 */
	public String getOperatingFrequency() {
		return operatingFrequency;
	}

	/**
	 * @return the maximumFrequency
	 */
	public String getMaximumFrequency() {
		return maximumFrequency;
	}

	/**
	 * @return the powerConsumption
	 */
	public String getPowerConsumption() {
		return powerConsumption;
	}
	
	@Override
	public String toString() {
		return "[" 
				+ "manufacturer: " + manufacturer 
				+ ", name: " + name 
				+ ", operatingFrequency:" + operatingFrequency 
				+ ", maximumFrequency: " + maximumFrequency
				+ ", powerConsumption: " + powerConsumption 
				+ "]";
	}

	public static class ProcessorBuilder {

		private String manufacturer;
		private String name;
		private String operatingFrequency;
		private String maximumFrequency;
		private String powerConsumption;

		/**
		 * @param manufacturer the manufacturer to set
		 */
		public ProcessorBuilder setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
			return this;
		}

		/**
		 * @param name the name to set
		 */
		public ProcessorBuilder setName(String name) {
			this.name = name;
			return this;
		}

		/**
		 * @param operatingFrequency the operatingFrequency to set
		 */
		public ProcessorBuilder setOperatingFrequency(String operatingFrequency) {
			this.operatingFrequency = operatingFrequency;
			return this;
		}

		/**
		 * @param maximumFrequency the maximumFrequency to set
		 */
		public ProcessorBuilder setMaximumFrequency(String maximumFrequency) {
			this.maximumFrequency = maximumFrequency;
			return this;
		}

		/**
		 * @param powerConsumption the powerConsumption to set
		 */
		public ProcessorBuilder setPowerConsumption(String powerConsumption) {
			this.powerConsumption = powerConsumption;
			return this;
		}

		public ComputerProcessor build() {
			return new ComputerProcessor(this);
		}
	}
}
