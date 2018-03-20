package abhi.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {

	private UserValidationService validationService = new UserValidationService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		request.setAttribute("name", name);
		request.setAttribute("pass", pass);

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		boolean valid = validationService.isValid(name, pass);
		request.setAttribute("name", name);
		request.setAttribute("pass", pass);
		if (valid) {
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else if (!valid) {
			request.getRequestDispatcher("/WEB-INF/views/error.jsp").forward(request, response);
		}

	}
}
