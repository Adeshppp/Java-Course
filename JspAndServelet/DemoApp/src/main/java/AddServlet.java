import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		int i = Integer.parseInt(req.getParameter("num1"));

		int j = Integer.parseInt(req.getParameter("num2"));
		int result = (i+j);
//		result *=  result;
//		System.out.println("Result is : "+result);
//			
//		
//		res.getWriter().println("Result is : "+result);
		
		
		// request dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
	}	
}
  