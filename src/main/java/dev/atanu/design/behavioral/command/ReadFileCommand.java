/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class ReadFileCommand implements FileCommand {

	private FileReceiver fileReceiver;

	public ReadFileCommand(FileReceiver fileReceiver) {
		this.fileReceiver = fileReceiver;
	}

	@Override
	public String execute() {
		System.out.println("Inside ReadFileCommand");
		return fileReceiver.read();
	}

	@Override
	public String toString() {
		return "Command to read file : " + fileReceiver;
	}
}
