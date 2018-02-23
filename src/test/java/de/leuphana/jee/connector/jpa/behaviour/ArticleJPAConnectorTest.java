package de.leuphana.jee.connector.jpa.behaviour;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.leuphana.jee.shop.structure.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "/applicationContext-article-JPA-Connector.xml")
public class ArticleJPAConnectorTest {

	// private ApplicationContext applicationContext;

	@Autowired
	private ArticleJPAConnector articleJPAConnector;

	@Before
	public void setUp() throws Exception {

		// applicationContext = new
		// ClassPathXmlApplicationContext("applicationContext-article-JPA-Connector.xml");
		// articleJPAConnector = (ArticleJPAConnector)
		// applicationContext.getBean("articleJPAConnector");

		Article article1 = new Article();
		// article.setArticleId(4711);
		article1.setName("Kann weg");
		article1.setPrice(12.45);
		articleJPAConnector.insert(article1);

		Article article2 = new Article();
		// article.setArticleId(815);
		article2.setName("Doof");
		article2.setPrice(2.5);
		articleJPAConnector.insert(article2);
	}

	@After
	public void tearDown() throws Exception {
		// applicationContext = null;
	}

	@Test()
	public void canNumberOfArticlesBeFetched() {
		Assert.assertNotNull(articleJPAConnector.findArticleById(1));
	}

}