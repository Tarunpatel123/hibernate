package com.ssi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	@Id
	//@GeneratedValue(strategy =GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	/*@SequenceGenerator(name ="product_gen",allocationSize =1,initialValue =101)
	//@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "productcode_gen")*/
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int pcode;
	private  String name;
	private int price;
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
