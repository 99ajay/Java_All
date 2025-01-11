package com.demo.entity;

import jakarta.persistence.*;

@Entity
public class Student {
@Id
private long id;
private String name;
private String email;
private String mobile;
public Student(long id, String name, String email, String mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

}
