import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		int k = (int) req.getAttribute("result");
//
//		res.getWriter().print("square is "+(k*k));
//		int k = Integer.parseInt(req.getParameter("result"));
		
		//session management
		
//		HttpSession session = req.getSession();
//		int k = (int)session.getAttribute("sum");
		
		
		int k = 0;

		// cookies
		Cookie[] cookies = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("sum")) k=Integer.parseInt(c.getValue());
		}
		int result = k*k;
		res.getWriter().print("result is "+result);
	}
}
