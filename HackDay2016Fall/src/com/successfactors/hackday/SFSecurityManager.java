package com.successfactors.hackday;

import java.io.FileDescriptor;

public class SFSecurityManager extends SecurityManager {
	public SFSecurityManager() {
		super();
		System.out.println("Initializing SFSecurityManager....");
		System.err.println("Warning:!! Java Security Manager switched to SFSecurityManager !!");
	}

	@Override
	public void checkPermission(java.security.Permission perm, Object context) {
		// double mockup = Math.random();
		sfAuthorizedRules(0.1);
	}

	@Override
	public void checkPermission(java.security.Permission perm) {
		// double mockup = Math.random();
		sfAuthorizedRules(0.1);
	}

	@Override
	public void checkRead(FileDescriptor fd) {
		// super.checkRead(fd);
		double mockup = Math.random();
		sfAuthorizedRules(mockup);
	}

	@Override
	public void checkRead(String fd) {
		// super.checkRead(fd);
		double mockup = Math.random();
		sfAuthorizedRules(mockup);
	}

	@Override
	public void checkWrite(FileDescriptor fd) {
		// super.checkWrite(fd);
		double mockup = Math.random();
		sfAuthorizedRules(mockup);
	}

	@Override
	public void checkWrite(String fd) {
		// super.checkWrite(fd);
		double mockup = Math.random();
		sfAuthorizedRules(mockup);
	}

	private void sfAuthorizedRules(double parameter) {
		System.out.println("---------------------------- check authority ----------------------------");
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		boolean isAppContainerCall = true;
		for (StackTraceElement el : stackTrace) {
			if (el.getClassName().indexOf("SFSecurityServiceImpl") != -1) {
				isAppContainerCall = false;
				break;
			}
		}
		if (parameter > 0.3 && !isAppContainerCall) {
			throw new SFSecurityException("Access Denied! \n User didn't pass the Authority:[" + parameter + "].");
		} else {
			System.out.println("Authority passed!:[" + parameter + "].");
		}
		System.out.println("---------------------------------- end ----------------------------------");

	}
}