package com.ssi;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Transient;
@Entity
@Table(name="studentinfo")
public class Student {
	//@Id
	@EmbeddedId
  private Name name;
  @Column(length=30)
  private String email;
  private String mo;
  private Address address;
public Student(Name name, String email, String mo, Address address) {
	super();
	this.name = name;
	this.email = email;
	this.mo = mo;
	this.address = address;
}
public Student() {
	super();
}
public Name getName() {
	return name;
}
public void setName(Name name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMo() {
	return mo;
}
public void setMo(String mo) {
	this.mo = mo;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
  	
	
}
	/*@Transient
	private String University="Davv";
	@Id
	@Column(name="Roll_Number")
	private int rno;
	@Column(name="Studen_Name",nullable = false ,length = 23)
	private String name;
	@Column(name="Mobile_Number", nullable = false ,length = 23)
	private String mobile;
	@Column(name="Email", nullable = false ,length = 23)
	private String email;
	
	public Student() {
		super();
	}
	public Student(int rno, String name, String mobile, String email) {
		super();
		this.rno = rno;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}*/
