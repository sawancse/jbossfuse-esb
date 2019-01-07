package com.rama.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class LogIncidentProcessor implements Processor {
	 int count=0;
    @Override
    public void process(Exchange exchange) throws Exception {
        // get the id of the input
        String id = exchange.getIn().getBody(String.class);

        // set reply including the id
        exchange.getOut().setBody(id+"counter: " + count++);
    }

}
