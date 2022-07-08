
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/RegistrationServlet", "/register" })
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		
		if(email.isEmpty() || name.isEmpty() || age.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() ) {
			request.setAttribute("error", "You are missing one of the Fields");
			doGet(request, response);
		}else {
			if(password == confirmPassword) {
				request.setAttribute("error", "The passwords does not match.");
				doGet(request, response);
			}
			else {
				request.setAttribute("name", name);
				getServletContext().getRequestDispatcher("/success.jsp").forward(request, response);
			}
		}
	}

}
