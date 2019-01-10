package com.example.integration.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.example.integration.demo.model.Student;

public class StudentProcessor implements Processor {	

	@Override
	public void process(Exchange exchange) throws Exception {
		
		Student student = new Student();
		student.setName("Rahul Sharma");
		student.setRollNumber(1);
		student.setAge(5);
		
		exchange.getOut().setBody(student);
	}

}
