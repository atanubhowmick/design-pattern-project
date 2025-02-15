/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class SaveFileCommand implements FileCommand {

	private FileReceiver fileReceiver;

	public SaveFileCommand(FileReceiver fileReceiver) {
		this.fileReceiver = fileReceiver;
	}

	@Override
	public String execute() {
		System.out.println("Inside SaveFileCommand");
		return fileReceiver.save();
	}

	@Override
	public String toString() {
		return "Command to save file : " + fileReceiver;
	}

}
