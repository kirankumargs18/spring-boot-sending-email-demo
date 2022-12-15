package com.globallogic.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "order")
public class Order {

	private Long id;

	private Product product;

	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", product=" + product + ", customer=" + customer + "]";
	}

}
