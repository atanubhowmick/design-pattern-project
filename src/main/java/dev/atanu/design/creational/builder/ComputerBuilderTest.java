/**
 * 
 */
package dev.atanu.design.creational.builder;

/**
 * @author Atanu Bhowmick
 *
 */
public class ComputerBuilderTest {

	public static void main(String[] args) {
		Computer computer = Computer.builder()
				.setProcessor(ComputerProcessor.builder()
						.setManufacturer("Intel")
						.setName("Code i7")
						.setOperatingFrequency("2 GHZ")
						.setMaximumFrequency("4.5 GHz")
						.setPowerConsumption("32 Watt")
						.build())
				.setHddType("SSD")
				.setHddSize("1 TB")
				.setRam(ComputerRAM.builder()
						.setManufacturer("Samsung")
						.setName("Samsung M1")
						.setSize("16 GB")
						.setType("DDR4")
						.build())
				.setDisplaySize(14)
				.build();
		
		System.out.println(computer);
		
	}
}
