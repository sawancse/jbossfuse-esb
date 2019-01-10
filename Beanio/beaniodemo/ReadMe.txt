Camel Project for Blueprint 
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache Karaf.
You can run the following command from its shell:

    osgi:install -s mvn:com.example.integration/beaniodemo/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
    
    I have implemented restful service using cxf-rs with basic authentication using karaf realm. Refer cxfrsContext.xml for configuration.
    
    there is two api in the service
    
    1.enrollStudent - it is a POST method which is accepting a student json input and give a json as a response with status and Response code.
    
    Url and Sample input and output
    
    Url
    -----------------------------------------------------
    localhost:8182/studentService/enroll
    
    input
    -----------------------------------------------------
    {
		"name": "Bishnu Saha",
		"rollNumber": 1,
		"age": 29
	}
	
	Output
	--------------------------------------------------------
	{
    "Status": "Success",
    "Response Code": "200"
	}
	
	2.getStudent - it is a GET method which is accepting a student rollnumber as pathparam and  give a json as a response with studenDetail.
	
	Url and Sample input and output
	
	Url
	---------------------------------------------
	localhost:8182/studentService/getDetail/1
	
	Output
	---------------------------------
	{
    "name": "Bishnu Saha",
    "rollNumber": 1,
    "age": 29
	}
	
	Use postman to invoke rest api and use admin/admin for basic Auth.