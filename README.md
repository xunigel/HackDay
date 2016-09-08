# HackDay

WebService URL:
http://localhost:8080/HackDay2016Fall/resource?wsdl
QName("http://service.hackday.successfactors.com/", "ObtainSystemResourcesService")

Parameters:
1.Name: resourceName
description: enumerable values:SysProperty, SysFile, SysSocket, SysDBConnection,SysExit,SysThread,SysAWT,SysClassloader,SysListen

2.Name: resourceType
description: JVM this parameter is defined for future extention of including more resource types. not limited to JVM resources.

3.Name: isSecure
description: false to disable the check, true to enable permission check.

