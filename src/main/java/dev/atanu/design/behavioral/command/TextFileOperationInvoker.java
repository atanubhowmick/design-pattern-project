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
public class TextFileOperationInvoker {

	private List<TextFileCommand> history = new ArrayList<>();

	private TextFileCommand command;

	public String executeOperation() {
		if (command == null) {
			throw new IllegalStateException("Command is not set");
		}
		history.add(command);
		return command.execute();
	}

	public void setCommand(TextFileCommand command) {
		this.command = command;
	}

	public List<TextFileCommand> getHistory() {
		return history;
	}

}