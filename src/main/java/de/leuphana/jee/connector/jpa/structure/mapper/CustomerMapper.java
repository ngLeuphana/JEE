package de.leuphana.jee.connector.jpa.structure.mapper;

import de.leuphana.jee.connector.jpa.structure.CustomerEntity;
import de.leuphana.jee.shop.structure.Customer;

public class CustomerMapper {

	public static Customer convert2Customer(CustomerEntity customerEntity) {

		Customer customer = new Customer();
		customer.setCustomerId(customerEntity.getCustomerId());
		customer.setCart(CartMapper.convert2Cart(customerEntity.getCartEntity()));

		return customer;
	}

	public static CustomerEntity convert2CustomerEntity(Customer customer) {

		CustomerEntity customerEntity = new CustomerEntity();
		customerEntity.setCartEntity(CartMapper.convert2CartEntity(customer.getCart()));

		return customerEntity;
	}
}