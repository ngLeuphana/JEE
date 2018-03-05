package de.leuphana.jee.component.structure;

public class Customer {
	private Integer customerId;
	private Cart cart;
	
	public Customer() {
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
