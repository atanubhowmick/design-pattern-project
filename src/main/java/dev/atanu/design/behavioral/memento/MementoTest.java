/**
 * 
 */
package dev.atanu.design.behavioral.memento;

/**
 * https://howtodoinjava.com/design-patterns/behavioral/memento-design-pattern/
 * https://www.baeldung.com/java-memento-design-pattern
 * 
 * @author Atanu Bhowmick
 * 
 */
public class MementoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Article article = new Article(1, "My Article");
		article.setContent("ABCD"); // original content
		System.out.println("Content created");
		System.out.println(article);

		// created immutable memento
		ArticleMemento memento1 = article.createMemento();

		article.setContent("123"); // changed content
		System.out.println("Content replaced");
		System.out.println(article);

		article.restore(memento1); // UNDO change
		System.out.println("Content restored");
		System.out.println(article); // original content

		article.addContent("PQRS"); // Updated content
		System.out.println("Content updated");
		System.out.println(article);

		// created immutable memento
		ArticleMemento memento2 = article.createMemento();

		article.addContent("xyz"); // changed content
		System.out.println("Content updated again");
		System.out.println(article);

		article.restore(memento2); // UNDO change
		System.out.println("Content restored to previous state");
		System.out.println(article); // original content
	}

}
