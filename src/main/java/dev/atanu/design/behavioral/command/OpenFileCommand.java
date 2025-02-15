/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class OpenFileCommand implements FileCommand {

	private FileReceiver fileReceiver;

	public OpenFileCommand(FileReceiver fileReceiver) {
		this.fileReceiver = fileReceiver;
	}

	@Override
	public String execute() {
		System.out.println("Inside OpenFileCommand");
		return fileReceiver.open();
	}

	@Override
	public String toString() {
		return "Command to open file : " + fileReceiver;
	}
	
	

}
