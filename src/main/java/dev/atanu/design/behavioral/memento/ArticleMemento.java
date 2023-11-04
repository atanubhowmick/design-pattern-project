/**
 * 
 */
package dev.atanu.design.behavioral.memento;

/**
 * @author Atanu Bhowmick
 * 
 */
public final class ArticleMemento {

	private final long id;
	private final String title;
	private final String content;

	public ArticleMemento(long id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}
