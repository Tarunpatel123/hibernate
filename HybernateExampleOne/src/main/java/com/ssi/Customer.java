package com.ssi;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

 //import org.hibernate.mapping.Selectable;
 //import javax.persistence.Table;

@Entity
public class Customer  implements Serializable{
	@Id
	@Column(length=20)
  private  String  Fname;
	@Id
	@Column(length=20)
  private String Lname;
 private Address address;
 
 
    public Customer() {
   	super();
      }


public Customer(String fname, String lname, Address address) {
	super();
	Fname = fname;
	Lname = lname;
	this.address = address;
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


public Address getAddress() {
	return address;
}


public void setAddress(Address address) {
	this.address = address;
}


@Override
public String toString() {
	return "Customer [Fname=" + Fname + ", Lname=" + Lname + ", address=" + address + "]";
}

}

 



 
 

