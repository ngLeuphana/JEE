package de.leuphana.jee.connector.jpa.structure.mapper;

import de.leuphana.jee.connector.jpa.structure.ArticleEntity;
import de.leuphana.jee.shop.structure.Article;

public class ArticleMapper {

	public static Article convert2Article(ArticleEntity articleEntity) {

		Article article = new Article();
		article.setArticleId(articleEntity.getArticleId());
		article.setName(articleEntity.getName());
		article.setPrice(articleEntity.getPrice());

		return article;
	}

	public static ArticleEntity convert2ArticleEntity(Article article) {

		ArticleEntity articleEntity = new ArticleEntity();
//		articleEntity.setArticleId(article.getArticleId());
		articleEntity.setName(article.getName());
		articleEntity.setPrice(article.getPrice());

		return articleEntity;
	}
}