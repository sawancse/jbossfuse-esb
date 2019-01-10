 package com.example.integration.demo.processor;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;


import com.example.integration.demo.model.Student;

public class StudentServImpl {
	
	public static Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
	
	public void enroll(Exchange exchange)
	{
		Student student = exchange.getIn().getBody(Student.class);
		studentMap.put(student.getRollNumber(), student);
		HashMap<String, String> result = new HashMap<String, String>();
		result.put("Status", "Success");
		result.put("Response Code", "200");
		exchange.getIn().setBody(result);
	}
	
	public void getStudent(Exchange exchange)
	{
		exchange.getIn().setBody(studentMap.get(exchange.getIn().getHeader("id")));
	}

}
