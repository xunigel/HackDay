package com.successfactors.hackday.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.successfactors.hackday.service.IObtainSystemResources;

public class SFSecurityManagerCaller {

	public SFSecurityManagerCaller() {
	}

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://localhost:8080/HackDay2016Fall/resource?wsdl");
		QName qname = new QName("http://service.hackday.successfactors.com/", "ObtainSystemResourcesService");

		Service service = Service.create(url, qname);

		IObtainSystemResources obtainer = service.getPort(IObtainSystemResources.class);

		System.out.println(obtainer.getResources("SysFile", "File", false));

	}

}
