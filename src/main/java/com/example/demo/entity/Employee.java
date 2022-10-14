package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
    
	@Id
	@Column(name="employee_id")
    public String employeeId;
	
	@Column(name="name")
    public String name;
	
	@Column(name="age")
    public int age;
	
	@Column(name = "mobile_number")
	public String mobileNumber;
	
	@Column(name = "email_id")
	public String emailId;
	
	@Column(name = "designation")
	public String designation;
	
	public Employee() {
		
	}

	public Employee(String employeeId, String name, int age, String mobileNumber, String emailId, String designation) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.designation = designation;
	}



	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
