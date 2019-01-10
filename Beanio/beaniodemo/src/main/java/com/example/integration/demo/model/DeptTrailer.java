package com.example.integration.demo.model;

public class DeptTrailer {
	
	private String recordType;
	private int employeeCount;
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	@Override
	public String toString() {
		return "DeptTrailer [recordType=" + recordType + ", employeeCount=" + employeeCount + "]";
	}	

}
