package com.example.shoppingapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customerordes")
public class CustomerOrders {
	
	@Id
	@Column(name="orderid")
	private int orderId;
	
	@ManyToOne
	@JoinColumn(name="customerid", referencedColumnName ="customerId")
	private CustomerDetails custid;
	
	@Column(name="product")
	private String product;
	
	@Column(name="cost")
	private int cost;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public CustomerDetails getCustid() {
		return custid;
	}

	public void setCustid(CustomerDetails custid) {
		this.custid = custid;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
