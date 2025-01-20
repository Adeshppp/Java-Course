import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));

		int j = Integer.parseInt(req.getParameter("num2"));
		int result = (i+j);

		System.out.println("Result is : "+result);
		
//		can pass the result of addition to the square servlet by using request which we are sending along with a call.
		
//		req.setAttribute("result", result);
		
// 		request dispatcher to forward the request to square servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	
		
		
//		send redirect to forward a request to square servlet
//		res.sendRedirect("sq?result="+result); // URL Rewritings
		
		
//		Session management
//		HttpSession session = req.getSession();
//		session.setAttribute("sum",result);
		
		// cookies
		Cookie cookie = new Cookie("sum", result+"");
		res.addCookie(cookie);
		
		
		res.sendRedirect("sq");
		
		
	}	
}
  