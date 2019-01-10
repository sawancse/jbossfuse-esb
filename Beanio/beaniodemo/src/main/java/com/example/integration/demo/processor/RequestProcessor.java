package com.example.integration.demo.processor;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;

import com.example.integration.demo.model.Student;

public class RequestProcessor implements Processor{
	
    @Override
    public void process(Exchange exchange) throws Exception {
    	
            exchange.setPattern(ExchangePattern.InOut);
            
            Message inMessage = exchange.getIn();
            
            // set the operation name
            inMessage.setHeader(CxfConstants.OPERATION_NAME, "enrollStudent");
            
            // using the proxy client API
            inMessage.setHeader(CxfConstants.CAMEL_CXF_RS_USING_HTTP_API, Boolean.FALSE);
             
            //creating the request
            MessageContentsList req = new MessageContentsList();
            req.add(inMessage.getBody(Student.class));
            inMessage.setBody(req);
 
        }
}