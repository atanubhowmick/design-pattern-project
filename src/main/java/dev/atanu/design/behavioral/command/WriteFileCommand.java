/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class WriteFileCommand implements FileCommand {

	private FileReceiver fileReceiver;

	public WriteFileCommand(FileReceiver fileReceiver) {
		this.fileReceiver = fileReceiver;
	}

	@Override
	public String execute() {
		System.out.println("Inside WriteFileCommand");
		return fileReceiver.write();
	}

	@Override
	public String toString() {
		return "Command to write file : " + fileReceiver;
	}

}
