package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonBackReference;

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
    private int id;
//	@NotNull(message = "Please provid FirstName")
	private String firstName;
//	@NotNull(message = "Please provid LastName")
	private String lastName;
//	@Email(message = "Please provid Email")
	private String email;
//	@NotNull(message = "Please provid PhoneNo")
//	@Pattern(regexp="(^$|[0-9]{10})")
	private String phoneNo;
	
	
    
    @ManyToOne(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id",nullable = false)
    @JsonBackReference
    private Course course;



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}
    
    
}