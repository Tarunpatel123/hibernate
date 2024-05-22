package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="delete_query",query="delete from Employe where sal>4000 ")
@NamedQuery(name="select_query",query="from Employe where sal>4000")
public class Employe {
	@Id
	private int id;
	private String name;
	private String sal;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employe(int id, String name, String sal, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	
	}
	
	


