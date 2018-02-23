package de.leuphana.jee.connector.jpa.behaviour;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.leuphana.jee.connector.jpa.structure.ArticleEntity;
import de.leuphana.jee.connector.jpa.structure.mapper.ArticleMapper;
import de.leuphana.jee.shop.structure.Article;

@Transactional
@Component
public class ArticleJPAConnector {
	
	private EntityManager entityManager;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Article article) {
		entityManager.persist(ArticleMapper.convert2ArticleEntity(article));
	}

	public Article findArticleById(Integer articleId) {
		Article article = null;
		
		ArticleEntity articleEntity = entityManager.find(ArticleEntity.class, articleId);
		
		return ArticleMapper.convert2Article(articleEntity);
	}

}
