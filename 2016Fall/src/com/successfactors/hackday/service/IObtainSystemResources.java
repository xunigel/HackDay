package com.successfactors.hackday.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IObtainSystemResources {
	@WebMethod
	String getResources(String resourceName, String resourceType, boolean isSecure);

}