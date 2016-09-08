package com.successfactors.hackday.server;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.successfactors.hackday.service.SFSecurityServiceImpl;

public class SFServers {

	public SFServers() {
	}

	public static void main(String[] args) {
		System.out.println("Starting Server.....");
		SFSecurityServiceImpl implementor = new SFSecurityServiceImpl();
		JAXRSServerFactoryBean restServer = new JAXRSServerFactoryBean();
		List<Object> services = new ArrayList<Object>();
		services.add(implementor);
		restServer.setServiceBeans(services);
		String address = "http://localhost:8080";
		restServer.setAddress(address);
		restServer.create();
		// Endpoint.publish(address, implementor
	}

}
