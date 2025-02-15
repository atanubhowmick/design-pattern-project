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
public class CommandDesignTest {

	public static void main(String[] args) {

		FileReceiver textFile = new TextFile("Test.txt");
		FileReceiver wordFile = new WordFile("Info.docs");

		// Text file commands.
		FileOperationInvoker invoker = new FileOperationInvoker();
		
		invoker.setCommand(new OpenFileCommand(textFile));
		System.out.println(invoker.executeOperation());
		
		invoker.setCommand(new ReadFileCommand(textFile));
		System.out.println(invoker.executeOperation());

		invoker.setCommand(new WriteFileCommand(textFile));
		System.out.println(invoker.executeOperation());

		invoker.setCommand(new SaveFileCommand(textFile));
		System.out.println(invoker.executeOperation());
		
		invoker.setCommand(new CloseFileCommand(textFile));
		System.out.println(invoker.executeOperation());

		System.out.println("**************************");
		
		// Word file command. Executing only selected commands.
		invoker.setCommand(new OpenFileCommand(wordFile));
		System.out.println(invoker.executeOperation());
		
		invoker.setCommand(new ReadFileCommand(wordFile));
		System.out.println(invoker.executeOperation());
		
		invoker.setCommand(new CloseFileCommand(wordFile));
		System.out.println(invoker.executeOperation());
	
		// Printing history
		System.out.println("********History*******");
		invoker.getHistory().forEach(System.out :: println);
	}
	
}
