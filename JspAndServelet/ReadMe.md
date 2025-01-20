
Download Eclipse IDE from:

https://www.eclipse.org/downloads/packages/release/2024-12/r/eclipse-ide-enterprise-java-and-web-developers


to implement JSP Servelet, we need premium version of intellij.


Download tomcat server and documentation from:

https://tomcat.apache.org/download-90.cgi



to call another servlet from one servlet we have below options:
		
1. Request dispatcher
2. redirect


to send a data from one servlet to another servlet or to share data with another servlet we use the concept of session management.

When we call another servlet from one servlet we can pass the data by using req being sent in a servlet.
req.setAttribute("key",value);

in another servlet which is being called we can retrieve that data by using

req.getAttribute("key");
