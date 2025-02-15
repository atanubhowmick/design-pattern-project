/**
 * 
 */
package dev.atanu.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Atanu Bhowmick
 *
 */
public class FileOperationInvoker {

	private List<FileCommand> history = new ArrayList<>();

	private FileCommand command;

	public String executeOperation() {
		if (command == null) {
			throw new IllegalStateException("Command is not set");
		}
		history.add(command);
		return command.execute();
	}

	public void setCommand(FileCommand command) {
		this.command = command;
	}

	public List<FileCommand> getHistory() {
		return history;
	}

}