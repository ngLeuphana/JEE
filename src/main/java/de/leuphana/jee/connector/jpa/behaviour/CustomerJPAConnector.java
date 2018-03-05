package de.leuphana.jee.connector.jpa.behaviour;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import de.leuphana.jee.component.structure.Customer;
import de.leuphana.jee.connector.jpa.structure.CustomerEntity;
import de.leuphana.jee.connector.jpa.structure.mapper.CustomerMapper;

@Transactional
@Component
public class CustomerJPAConnector {
	
	private EntityManager entityManager;
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void insert(Customer customer) {
		entityManager.persist(CustomerMapper.convert2CustomerEntity(customer));
	}

	public Customer findCustomerById(Integer customerId) {
		CustomerEntity customerEntity = entityManager.find(CustomerEntity.class, customerId);
		
		return CustomerMapper.convert2Customer(customerEntity);
	}

}
