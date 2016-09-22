package com.successfactors.hackday.service;


public interface ISFSecurityService {

	String getResource(String resourceName, String resourceType, boolean isSecure);
}
