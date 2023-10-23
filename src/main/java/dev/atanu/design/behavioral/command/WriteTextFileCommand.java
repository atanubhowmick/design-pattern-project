/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class WriteTextFileCommand implements TextFileCommand {

	private String fileName;

	public WriteTextFileCommand(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String execute() {
		return "Writing file " + fileName;
	}

}
