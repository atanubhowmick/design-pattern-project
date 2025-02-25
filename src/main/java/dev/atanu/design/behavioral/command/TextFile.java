/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class TextFile implements FileReceiver {

	private final String fileName;

	public TextFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String open() {
		return "Opening text file: " + fileName;
	}

	@Override
	public String read() {
		return "Reading text file: " + fileName;
	}

	@Override
	public String write() {
		return "Writing to text file: " + fileName;
	}

	@Override
	public String save() {
		return "Saving text file: " + fileName;
	}

	@Override
	public void close() {
		System.out.println("Closing text file: " + fileName);
	}

	@Override
	public String toString() {
		return "TextFile[" + fileName + "]";
	}
}
