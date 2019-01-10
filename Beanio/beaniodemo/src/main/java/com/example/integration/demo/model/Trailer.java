package com.example.integration.demo.model;

public class Trailer {
	
	private String recordType;
	private int departmentCount;
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public int getDepartmentCount() {
		return departmentCount;
	}
	public void setDepartmentCount(int departmentCount) {
		this.departmentCount = departmentCount;
	}
	
	@Override
	public String toString() {
		return "Trailer [recordType=" + recordType + ", departmentCount=" + departmentCount + "]";
	}

}
