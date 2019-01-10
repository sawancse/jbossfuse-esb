package com.example.integration.demo.model;

import java.util.Date;

public class Header {
	
	private String recordType;
	private Date fileDate;
	
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public Date getFileDate() {
		return fileDate;
	}
	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}
	
	@Override
	public String toString() {
		return "Header [recordType=" + recordType + ", fileDate=" + fileDate + "]";
	}	
}
