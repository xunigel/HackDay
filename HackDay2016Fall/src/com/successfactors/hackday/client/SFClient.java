package com.successfactors.hackday.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.successfactors.hackday.bean.ParamBean;
import com.successfactors.hackday.service.ISFSecurityService;

public class SFClient {

	public SFClient() {
	}

	public static void main(String[] args) throws Exception {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(ISFSecurityService.class);
		factory.setAddress("http://localhost:8080/HackDay2016Fall/resource/");
		ISFSecurityService client = (ISFSecurityService) factory.create();
		ParamBean param = new ParamBean();
		param.setResourceName("System Property");
		param.setResourceType("JVM");
		String reply = client.getResource("SystemProperty", "JVM", true);
		System.out.println("Server said: " + reply);
	}

}
