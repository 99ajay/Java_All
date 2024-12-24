package com.tut;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //(name="student_details")// we have change the name of entity by this  //Hibernate will understand ki ise hame as a entity use krna hai 
public class Student {

@Id
private int id;
private String name;
private String city;
public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
}
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}


}
