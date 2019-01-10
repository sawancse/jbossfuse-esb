package com.example.integration.demo.model;

import java.util.Date;

public class Employee {
	
	private String recordType;
	private String firstName;
	private String lastName;
	private String title;
	private Double salary;
	private Date hireDate;
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "Employee [recordType=" + recordType + ", firstName=" + firstName + ", lastName=" + lastName + ", title="
				+ title + ", salary=" + salary + ", hireDate=" + hireDate + "]";
	}    

}
