import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

//		int k = (int) req.getAttribute("result");
//
//		res.getWriter().print("square is "+(k*k));
		int k = Integer.parseInt(req.getParameter("result"));
		System.out.println("SQ called");
		res.getWriter().print("result is "+(k*k));
	}
}
