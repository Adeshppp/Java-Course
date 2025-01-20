
Download Eclipse IDE from:

https://www.eclipse.org/downloads/packages/release/2024-12/r/eclipse-ide-enterprise-java-and-web-developers


to implement JSP Servelet, we need premium version of intellij.


Download tomcat server and documentation from:

https://tomcat.apache.org/download-90.cgi





to send a data from one servlet to another servlet or to share data with another servlet we use the concept of session management.

When we call another servlet from one servlet we can pass the data by using req being sent in a servlet.
req.setAttribute("key",value);

in another servlet which is being called we can retrieve that data by using
req.getAttribute("key");


### HttpServletRequest & HttpServletResponse

in servlet, we declare service class which have 2 parameters req of type HttpServletRequest and res of type HttpServletResponse.
both of these are interfaces, we do not create a object we do not provide implementation to it. here tomcat server comes in a picture and provides an implementation. we dont need to woprry about that implemntation, we can simply use that as below:

> 	public void service(HttpServletRequest req, HttpServletResponse res)

response can be a type of text, html or video.


### RequestDispatcher & sendRedirect theory

to call another servlet from one servlet we have below options:

1. Request dispatcher
2. sendRedirect


#### RequestDispatcher:
When client makes a request to one servlet (s1) and s1 further makes a request to servlet s2 and s2 itself returns a response to client and in this case client dows not know which servlet has responded.
this can be implemented by using below syntax in a servlet.
> RequestDispatcher rd = req.getRequestDispatcher("sq");

#### sendRedirect:
When client make a request to s1 servlet and if this website wants to jump on another website's (third party : payment gateway) servlet s2, at that time s1 responds client saying you need to redirect to the s2.
in this case, client knows which servlet is responding.
> res.sendRedirect("sq");


## Session Management
above approach of calling another servlet from one servlet is good when we have only one servlet to servlet call.
when there are multiple servlet call like chain calling then at that time managing data is difficult. to tackle that we have session management. we can send data through session.
so req object provided by tomcat server takes care of that by using session.
as we know in chain servlet calling, it passes same req and res object throughout the lifecycle amd req object has session functionlity which we can use throughout.

> HttpSession session = req.getSession();

We can set and get values from session :
> session.setAttribute("key", value);
> session.getAttribute("key");
> session.removeAttribute("key");

Normally we use session for login purpose.

for normal data storage throughout the request lifecycle, we can use cookies.
 
## Cookies
Again likewise tomcat provides cookies functionality, when client receives a request from a servlet it provides a cookies in a response and client again send back the cookies to another servlet in chain calling.


Add cookies to response
> Cookie cookie = new Cookie("key", "value");
> res.addCookie(cookie);

Access cookies from a request in another servlet
> Cookie[] cookies = req.getCookies();
> cookie.getValue();
