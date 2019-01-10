package com.example.integration.demo.service;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.integration.demo.model.Student;

@Path("studentService")
public interface StudentService {
	
	@POST
	@Path("/enroll")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String enrollStudent(Student student);
	
	@GET
	@Path("/getDetail/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Student getStudent(@PathParam("id") int id); 

}
