package com.example.integration.demo.model;

public class DeptHeader {
	
	private String recordType;
	private String departmentName;
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "DeptHeader [recordType=" + recordType + ", departmentName=" + departmentName + "]";
	}	
}
