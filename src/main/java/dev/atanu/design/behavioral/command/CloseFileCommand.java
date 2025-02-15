/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class CloseFileCommand implements FileCommand {

	private FileReceiver fileReceiver;

	public CloseFileCommand(FileReceiver fileReceiver) {
		this.fileReceiver = fileReceiver;
	}

	@Override
	public String execute() {
		System.out.println("Inside CloseFileCommand");
		fileReceiver.close();
		return "File closed";
	}

	@Override
	public String toString() {
		return "Command to close file : " + fileReceiver;
	}
}
