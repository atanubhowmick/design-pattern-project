/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class WordFile implements FileReceiver {

	private final String fileName;

	public WordFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String open() {
		return "Opening word file: " + fileName;
	}

	@Override
	public String read() {
		return "Reading word file: " + fileName;
	}

	@Override
	public String write() {
		return "Writing to word file: " + fileName;
	}

	@Override
	public String save() {
		return "Saving word file: " + fileName;
	}

	@Override
	public void close() {
		System.out.println("Closing word file: " + fileName);
	}

	@Override
	public String toString() {
		return "WordFile[" + fileName + "]";
	}
}
