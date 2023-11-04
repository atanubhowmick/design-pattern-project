/**
 * 
 */
package dev.atanu.design.behavioral.memento;

/**
 * @author Atanu Bhowmick
 * 
 */
public class Article {

	private long id;
	private String title;
	private String content;

	public Article(long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void addContent(String content) {
		this.content += content;
	}

	/**
	 * Create a memento
	 * 
	 * @return
	 */
	public ArticleMemento createMemento() {
		ArticleMemento memento = new ArticleMemento(id, title, content);
		return memento;
	}

	/**
	 * Restore the article from a memento
	 * @param memento
	 */
	public void restore(ArticleMemento memento) {
		this.id = memento.getId();
		this.title = memento.getTitle();
		this.content = memento.getContent();
	}

	@Override
	public String toString() {
		return "Article [id = " + id + ", title = " + title + ", content = " + content + "]";
	}
}
