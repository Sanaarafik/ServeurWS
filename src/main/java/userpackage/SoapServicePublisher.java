package userpackage;
import javax.xml.ws.Endpoint;


public class SoapServicePublisher {
	
	    public static void main(String[] args) {
	        Endpoint.publish("http://localhost:8010/userservice", new UserServiceImpl());
	        System.out.println("Service published at http://localhost:8010/userservice");
	    }
	}

