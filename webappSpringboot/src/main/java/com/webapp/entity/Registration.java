package com.webapp.entity;

import javax.persistence.*;

@Entity
@Table(name="registrations")
public class Registration {
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name="first_name", nullable=false, length=100 )
private String firstName;

@Column(name="email_id",nullable=false,unique=true,length=255)
private String email;

@Column(name="mobile", nullable=false, unique=true,length=10)
private String mobile;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
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
