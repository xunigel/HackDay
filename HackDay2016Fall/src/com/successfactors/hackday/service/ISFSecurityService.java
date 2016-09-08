package com.successfactors.hackday.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/resource/")
public interface ISFSecurityService {
	@GET
	String getResource(@PathParam("resourceName") String resourceName, @PathParam("resourceType") String resourceType,
			@PathParam("isSecure") boolean isSecure);
}
