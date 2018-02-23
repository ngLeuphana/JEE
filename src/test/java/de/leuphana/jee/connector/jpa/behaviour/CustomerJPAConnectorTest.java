package de.leuphana.jee.connector.jpa.behaviour;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import de.leuphana.jee.shop.structure.Article;
import de.leuphana.jee.shop.structure.Cart;
import de.leuphana.jee.shop.structure.CartItem;
import de.leuphana.jee.shop.structure.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"/applicationContext-article-JPA-Connector.xml", "/applicationContext-customer-JPA-Connector.xml"})
public class CustomerJPAConnectorTest {

//	private ApplicationContext applicationContext;

	@Autowired
	private ArticleJPAConnector articleJPAConnector;
	
	@Autowired
	private CustomerJPAConnector customerJPAConnector;

	@Before
	public void setUp() throws Exception {

//		applicationContext = new ClassPathXmlApplicationContext("applicationContext-article-JPA-Connector.xml");
//		articleJPAConnector = (ArticleJPAConnector) applicationContext.getBean("articleJPAConnector");
		
		Article article1 = new Article();
		// article.setArticleId(4711);
		article1.setName("Kann weg");
		article1.setPrice(12.45);
		articleJPAConnector.insert(article1);
		
		article1 = articleJPAConnector.findArticleById(1);
		
		Cart cart = new Cart();
		
		CartItem cartItem = new CartItem();
		cartItem.setArticleId(article1.getArticleId());
		cartItem.setQuantity(2);
		
		cart.add(cartItem);
		
		Customer customer = new Customer();
		customer.setCart(cart);
		customerJPAConnector.insert(customer);
	}

	@After
	public void tearDown() throws Exception {
//		applicationContext = null;
	}

	@Test()
	public void canNumberOfArticlesBeFetched() {
		Assert.assertNotNull(customerJPAConnector.findCustomerById(2));
	}
	
}