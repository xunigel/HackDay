package com.successfactors.hackday.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//@WebService(endpointInterface = "com.successfactors.hackday.service.ISFSecurityService", serviceName = "resource")

@Path("/resource")
public class SFSecurityServiceImpl implements ISFSecurityService {

	public SFSecurityServiceImpl() {
	}

	@GET
	@Path("/obtain/{resourceName}/{resourceType}/{isSecure}")
	@Produces("application/text")
//	@Consumes("application/json")
	public String getResource(@PathParam("resourceName") String resourceName,
			@PathParam("resourceType") String resourceType, @PathParam("isSecure") boolean isSecure) {
		return "Gotcha!";
	}

}
