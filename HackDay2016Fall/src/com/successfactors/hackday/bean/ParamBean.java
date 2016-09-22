package com.successfactors.hackday.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ParamBean")
public class ParamBean {

	public ParamBean() {
	}
	private String resourceName;
	private String resourceType;
	private boolean isSecure = true;

	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceType() {
		return resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}
	public boolean isSecure() {
		return isSecure;
	}
	public void setSecure(boolean isSecure) {
		this.isSecure = isSecure;
	}
}
