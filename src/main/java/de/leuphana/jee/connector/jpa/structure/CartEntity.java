package de.leuphana.jee.connector.jpa.structure;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CartEntity {
	private Integer cartId;
	private Set<CartItemEntity> cartItemsEntitySet;
	
	public CartEntity() {
		cartItemsEntitySet = new HashSet<>();
	}

	@Id
	@GeneratedValue
	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	@OneToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	public Set<CartItemEntity> getCartItemsEntity() {
		return cartItemsEntitySet;
	}

	public void setCartItemsEntity(Set<CartItemEntity> cartItemsEntitySet) {
		this.cartItemsEntitySet = cartItemsEntitySet;
	}
	
	public void addCartItem(CartItemEntity cartItemEntity) {
		cartItemsEntitySet.add(cartItemEntity);
	}
	
}
