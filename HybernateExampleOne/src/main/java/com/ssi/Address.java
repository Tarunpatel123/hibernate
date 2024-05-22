package com.ssi;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private	String hno;
private String city;
public String getHno() {
	return hno;
}
public void setHno(String hno) {
	this.hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(String hno, String city) {
	super();
	this.hno = hno;
	this.city = city;
}
public Address() {
	super();
}
@Override
public String toString() {
	return "Address [hno=" + hno + ", city=" + city + "]";
}

}
