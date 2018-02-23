package de.leuphana.jee.connector.jpa.structure.mapper;

import de.leuphana.jee.connector.jpa.structure.CartEntity;
import de.leuphana.jee.connector.jpa.structure.CartItemEntity;
import de.leuphana.jee.shop.structure.Cart;
import de.leuphana.jee.shop.structure.CartItem;

public class CartMapper {

	public static Cart convert2Cart(CartEntity cartEntity) {

		Cart cart = new Cart();
		cart.setCartId(cartEntity.getCartId());
		for (CartItemEntity cartItemEntity : cartEntity.getCartItemsEntity()) {
			cart.add(CartItemMapper.convert2CartItem(cartItemEntity));
		}

		return cart;
	}

	public static CartEntity convert2CartEntity(Cart cart) {

		CartEntity cartEntity = new CartEntity();
		
		for (CartItem cartItem : cart.getCartItems()) {
			
			cartEntity.addCartItem(CartItemMapper.convert2CartItemEntity(cartItem));
		}

		return cartEntity;
	}
}