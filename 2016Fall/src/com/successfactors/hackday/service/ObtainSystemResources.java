package com.successfactors.hackday.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.successfactors.hackday.service.IObtainSystemResources")
public class ObtainSystemResources implements IObtainSystemResources {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.successfactors.hackday.service.IObtainSystemResources#getResources
	 * (java.lang.String, java.lang.String, boolean)
	 */
	@Override
	public String getResources(String resourceName, String resourceType, boolean isSecure) {
		return "Resource Returned:" + resourceType + "[Name:" + resourceName + "].";
	}
}
