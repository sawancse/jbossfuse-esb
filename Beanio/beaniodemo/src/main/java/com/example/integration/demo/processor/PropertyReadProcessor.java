package com.example.integration.demo.processor;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyReadProcessor implements Processor {
	
	Logger logger = LoggerFactory.getLogger(PropertyReadProcessor.class);
	

	@Override
	public void process(Exchange exchange) throws Exception {
		
		logger.info("In Processor unmarshalBody property value ::"+exchange.getProperty("unmarshalBody",ArrayList.class).get(0));
	}

}
