/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class OpenTextFileCommand implements TextFileCommand {

	private String fileName;

	public OpenTextFileCommand(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String execute() {
		return "Opening file " + fileName;
	}

}
