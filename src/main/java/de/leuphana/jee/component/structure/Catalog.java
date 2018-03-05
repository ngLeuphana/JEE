package de.leuphana.jee.component.structure;

import java.util.HashSet;
import java.util.Set;

public class Catalog {
	
//	private Article[] articles;
	
	private CatalogType catalogType;
	
	// Interface; Was?
	private Set<Article> articles;
	
	public Catalog(CatalogType catalogType) {
		this.catalogType = catalogType;
		
//		articles = new Article[10];
		
		// Implementierung; Wie?
		articles = new HashSet<Article>();
		
		Article article = new Article();
		article.setArticleId(1);
		article.setName("Java for Dummies");
		article.setPrice(12.99);
		
//		articles[0] = article;
		articles.add(article);
		
		article = new Article();
		article.setArticleId(2);
		article.setName("Web-Technologien");
		article.setPrice(59.99);
		
//		articles[0] = article;
		articles.add(article);
	}
	
	public Set<Article> getArticles() {
		return articles;
	}
	
	public Article getArticle(int articleId) {
		Article foundArticle = null;
		
		for (Article article : articles) {
			if(article.getArticleId() == articleId) {
				foundArticle = article;
			}
		}
		
		return foundArticle;
	}


}