package de.leuphana.jee.connector.jpa.structure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ArticleJPA")
public class ArticleEntity  {
	private Integer articleId;
	private String name;
	private double price;

	public ArticleEntity() {
	}

	@Id
	@GeneratedValue
	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
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
