/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class SaveTextFileCommand implements TextFileCommand {

	private String fileName;

	public SaveTextFileCommand(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String execute() {
		return "Saving file " + fileName;
	}

}
