/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * @author Atanu Bhowmick
 *
 */
public class TextFile implements FileReceiver {

	private String fileName;

	public TextFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String open() {
		return "Opening file " + fileName;
	}

	@Override
	public String write() {
		return "Writing to file " + fileName;
	}

	@Override
	public String save() {
		return "Saving file " + fileName;
	}

}
