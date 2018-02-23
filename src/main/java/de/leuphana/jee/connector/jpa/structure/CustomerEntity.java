package de.leuphana.jee.connector.jpa.structure;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerEntity {
	// intrinsic attribute
	private Integer customerId;

	// relational attribute
	private CartEntity cartEntity;

	@Id
	@GeneratedValue
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public CartEntity getCartEntity() {
		return cartEntity;
	}

	public void setCartEntity(CartEntity cartEntity) {
		this.cartEntity = cartEntity;
	}

}
