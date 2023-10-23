/**
 * 
 */
package dev.atanu.design.behavioral.command;

/**
 * https://www.baeldung.com/java-command-pattern
 * https://www.digitalocean.com/community/tutorials/command-design-pattern
 * 
 * @author Atanu Bhowmick
 *
 */
public class TextCommandDesignTest {

	public static void main(String[] args) {

		String file1 = "Test.txt";
		String file2 = "Command.txt";

		TextFileOperationInvoker invoker = new TextFileOperationInvoker();
		invoker.setCommand(new OpenTextFileCommand(file1));
		System.out.println(invoker.executeOperation());

		invoker.setCommand(new WriteTextFileCommand(file1));
		System.out.println(invoker.executeOperation());

		invoker.setCommand(new SaveTextFileCommand(file1));
		System.out.println(invoker.executeOperation());

		// file2 command
		invoker.setCommand(new OpenTextFileCommand(file2));
		System.out.println(invoker.executeOperation());
		
	}
	
}
