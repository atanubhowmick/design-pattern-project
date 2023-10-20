/**
 * 
 */
package dev.atanu.design.creational.builder;

/**
 * @author Atanu Bhowmick
 *
 */
public class Computer {

	private ComputerProcessor processor;
	private ComputerRAM ram;
	private String hddType;
	private String hddSize;
	private int displaySize;

	private Computer(ComputerBuilder builder) {
		this.processor = builder.processor;
		this.ram = builder.ram;
		this.hddType = builder.hddType;
		this.hddSize = builder.hddSize;
		this.displaySize = builder.displaySize;
	}

	public static ComputerBuilder builder() {
		return new ComputerBuilder();
	}

	/**
	 * @return the processor
	 */
	public ComputerProcessor getProcessor() {
		return processor;
	}

	/**
	 * @return the ram
	 */
	public ComputerRAM getRam() {
		return ram;
	}

	/**
	 * @return the hddType
	 */
	public String getHddType() {
		return hddType;
	}

	/**
	 * @return the hddSize
	 */
	public String getHddSize() {
		return hddSize;
	}

	/**
	 * @return the displaySize
	 */
	public int getDisplaySize() {
		return displaySize;
	}

	@Override
	public String toString() {
		return "[" 
				+ "processor: " + processor 
				+ ", RAM: " + ram 
				+ ", hddType:" + hddType 
				+ ", hddSize: " + hddSize
				+ ", displaySize: " + displaySize 
				+ "]";
	}

	public static class ComputerBuilder {

		private ComputerProcessor processor;
		private ComputerRAM ram;
		private String hddType;
		private String hddSize;
		private int displaySize;

		/**
		 * @param processor the processor to set
		 * @return
		 */
		public ComputerBuilder setProcessor(ComputerProcessor processor) {
			this.processor = processor;
			return this;
		}

		/**
		 * @param ram the ram to set
		 */
		public ComputerBuilder setRam(ComputerRAM ram) {
			this.ram = ram;
			return this;
		}

		/**
		 * @param hddType the hddType to set
		 */
		public ComputerBuilder setHddType(String hddType) {
			this.hddType = hddType;
			return this;
		}

		/**
		 * @param hddSize the hddSize to set
		 */
		public ComputerBuilder setHddSize(String hddSize) {
			this.hddSize = hddSize;
			return this;
		}

		/**
		 * @param displaySize the displaySize to set
		 */
		public ComputerBuilder setDisplaySize(int displaySize) {
			this.displaySize = displaySize;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
