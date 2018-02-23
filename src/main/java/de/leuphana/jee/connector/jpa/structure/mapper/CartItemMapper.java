package de.leuphana.jee.connector.jpa.structure.mapper;

import de.leuphana.jee.connector.jpa.structure.CartItemEntity;
import de.leuphana.jee.shop.structure.CartItem;

public class CartItemMapper {

	public static CartItem convert2CartItem(CartItemEntity cartItemEntity) {

		CartItem cartItem = new CartItem();
		cartItem.setCartItemId(cartItemEntity.getCartItemId());
		cartItem.setArticleId(cartItemEntity.getArticleId());
		cartItem.setQuantity(cartItemEntity.getQuantity());

		return cartItem;
	}

	public static CartItemEntity convert2CartItemEntity(CartItem cartItem) {

		CartItemEntity cartItemEntity = new CartItemEntity();
		cartItemEntity.setArticleId(cartItem.getArticleId());
		cartItemEntity.setQuantity(cartItem.getQuantity());

		return cartItemEntity;
	}
}