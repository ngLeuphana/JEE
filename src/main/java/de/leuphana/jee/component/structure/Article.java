package de.leuphana.jee.component.structure;

import java.io.Serializable;

public class Article implements Serializable {
	private Integer articleId;
	private String name;
	private double price;

	public Article() {
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
