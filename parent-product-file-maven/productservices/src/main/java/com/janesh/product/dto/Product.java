package com.janesh.product.dto; //dto - Data Transfer Object

public class Product {
	private int Id;
	private String pname;
	private String desp;
	private int price;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDesp() {
		return desp;
	}
	public void setDesp(String desp) {
		this.desp = desp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
