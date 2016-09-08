package com.successfactors.hackday;

import java.io.FileDescriptor;

public class SFSecurityManager extends SecurityManager {
  public SFSecurityManager() {
    super();
    System.out.println("Initializing SFSecurityManager....");
    System.err
        .println("Warning:!! Java Security Manager switched to SFSecurityManager !!");
  }

  @Override
  public void checkRead(FileDescriptor fd) {
    super.checkWrite(fd);
    double mockup = Math.random();
    sfAuthorizedRules(mockup);
  }

  @Override
  public void checkRead(String fd) {
    super.checkWrite(fd);
    double mockup = Math.random();
    sfAuthorizedRules(mockup);
  }

  @Override
  public void checkWrite(FileDescriptor fd) {
    super.checkWrite(fd);
    double mockup = Math.random();
    sfAuthorizedRules(mockup);
  }

  @Override
  public void checkWrite(String fd) {
    super.checkWrite(fd);
    double mockup = Math.random();
    sfAuthorizedRules(mockup);
  }

  private void sfAuthorizedRules(double parameter) {
    System.out.println("---------------------------- check authority ----------------------------");
    if (parameter > 0.5) {
      throw new SFSecurityException(
          "Access Denied! \n User didn't pass the Authority:[" + parameter
              + "].");
    } else {
      System.out.println("Authority passed!:[" + parameter + "].");
    }
    System.out.println("---------------------------------- end ----------------------------------");

  }
}