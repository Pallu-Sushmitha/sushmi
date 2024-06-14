package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Student {

 @Id

 @GeneratedValue 

 private int studentId;

 private String name;

 private String rollNumber;

 private String dateOfBirth;
 private String gender;
 private String email;
 private String phone;
 private String address;
 private String dateOfJoining;
 private String status;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNumber() {
	return rollNumber;
}
public void setRollNumber(String rollNumber) {
	this.rollNumber = rollNumber;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
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
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}