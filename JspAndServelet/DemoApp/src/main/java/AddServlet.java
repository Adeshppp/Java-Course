import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));

		int j = Integer.parseInt(req.getParameter("num2"));
		System.out.println("Result is : "+(i+j));
		
		
		res.getWriter().println("Result is : "+(i+j));
	}
}
  