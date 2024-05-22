package com.ssi;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//@Embeddable
public class Name implements Serializable{
	@Column(length=30)
	private String Fname;
	@Column(length=30)
	private String Lname;
	public Name(String fname, String lname) {
		super();
		Fname = fname;
		Lname = lname;
	}
	public Name() {
		super();
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}

}
