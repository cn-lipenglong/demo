package com.nantian.demo.domain;

public class Product {
	private String id;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 产品价格
	 */
	private String price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", price='" + price + '\'' +
				'}';
	}
}
