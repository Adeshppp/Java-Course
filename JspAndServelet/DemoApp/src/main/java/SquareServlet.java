import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int i = Integer.parseInt(req.getParameter("sum"));
//		res.getWriter().println(i*i);
		int k = (int) req.getAttribute("result");
//		int k = Integer.parseInt(req.getParameter("result"));

		res.getWriter().print("square is "+(k*k));
	}
}
