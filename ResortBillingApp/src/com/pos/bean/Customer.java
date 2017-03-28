package com.pos.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
@Id
@GeneratedValue
@Column(name="customer_id")
private Integer id;

@Column(name="customer_name",length = 40)
private String customerName;

@Column(name="email",length = 40)
private String email;

@Column(name="phone",length = 15)
private String phone;

@Column(name="address")
private String address;

@Column(name="in_date",length = 20)
private String inDate;

@Column(name="out_date",length = 20)
private String outDate;

@Column(name="card_id",length = 40)
private String cardId;

@Column(name="customer_photo",length = 40)
private String customerPhoto;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getInDate() {
	return inDate;
}

public void setInDate(String inDate) {
	this.inDate = inDate;
}

public String getOutDate() {
	return outDate;
}

public void setOutDate(String outDate) {
	this.outDate = outDate;
}

public String getCardId() {
	return cardId;
}

public void setCardId(String cardId) {
	this.cardId = cardId;
}

public String getCustomerPhoto() {
	return customerPhoto;
}

public void setCustomerPhoto(String customerPhoto) {
	this.customerPhoto = customerPhoto;
} 

}
