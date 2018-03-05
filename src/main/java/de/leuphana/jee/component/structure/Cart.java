package de.leuphana.jee.component.structure;

import java.util.HashSet;
import java.util.Set;

public class Cart {
//	private static Integer lastCartId = 0;
	
	private Integer cartId;
	// Interface; Was?
	private Set<CartItem> cartItems;

	public Cart() {
//		lastCartId++;
//		cartId = lastCartId;
		
//		cartId = ++lastCartId;
		
		// Implementierung; Wie?
		cartItems = new HashSet<CartItem>();
	}
	
	public Integer getCartId() {
		return cartId;
	}
	
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	
	public void add(CartItem cartItem) {
		cartItems.add(cartItem);
	}
	
	public void remove(CartItem cartItem) {
		cartItems.remove(cartItem);
	}
	
	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	
}