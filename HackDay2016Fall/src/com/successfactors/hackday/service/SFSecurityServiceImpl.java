package com.successfactors.hackday.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.successfactors.hackday.SFSecurityManager;

//@WebService(endpointInterface = "com.successfactors.hackday.service.ISFSecurityService", serviceName = "resource")

@Path("/resource")
@Produces({ "application/json", "application/xml", "application/text" })
public class SFSecurityServiceImpl implements ISFSecurityService {
	public void Init() {
	}

	private final static SecurityManager SM = System.getSecurityManager();
	static {
		if (!(System.getSecurityManager() instanceof SFSecurityManager)) {
			System.setSecurityManager(new SFSecurityManager());
		}
	}

	@GET
	@Path("/obtain/{resourceName}/{resourceType}/{isSecure}")
	@Produces("application/text")
	public String getResource(@PathParam("resourceName") String resourceName,
			@PathParam("resourceType") String resourceType, @PathParam("isSecure") boolean isSecure) {

		String msg = "";
		try {
			// System.setSecurityManager(new SFSecurityManager());
			System.setProperty("Hello", "SecurityGuard");
			msg = "Successfully borrowed system resource: [Resource Type=" + resourceType + ", Resource Name="
					+ resourceName + "] =>" + new Object().toString();
			File f = new File("test.txt");
			OutputStream out = new FileOutputStream(f);
			try {
				out.write("Hello, 2016 Fall!".getBytes());
			} finally {
				out.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
			msg = "Failed to get system resource: [Resource Type=" + resourceType + ", Resource Name=" + resourceName
					+ "], Error Message:" + System.getProperty("line.seperator") + e.getMessage();
		}
		try {
			return msg;
		} finally {
			// System.setSecurityManager(SM);

		}
	}

	@GET
	@Path("/ttt")
	@Produces("application/text")
	@Consumes({ "application/json", "application/xml" })
	public String getResource() {
		return "Gotcha!";
	}

}
