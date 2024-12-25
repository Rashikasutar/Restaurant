package com.restaurant;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	private String name;
	private int quantity ;
	private String location;
	private int price;
	
	public Restaurant() {
		super();
	}

	public Restaurant(String name, int quantity, String location, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.location = location;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", quantity=" + quantity + ", location=" + location + ", price=" + price
				+ "]";
	}
	

}
