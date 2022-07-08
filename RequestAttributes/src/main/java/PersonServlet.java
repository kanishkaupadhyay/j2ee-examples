
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Person;

/**
 * Servlet implementation class PersonServlet
 */
@WebServlet({ "/PersonServlet", "/person" })
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PersonServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String age = request.getParameter("age");

		StringBuilder error = new StringBuilder();
		if (firstName == null) {
			error.append("First name was not provided");
		} else if (lastName == null) {
			error.append("Last name was not provided");
		} else if (age == null) {
			error.append("Age was not provided");
		}

		if (error.length() > 0) {
			request.setAttribute("error", error);
		} else {
			request.setAttribute("person", new Person(firstName, lastName, Integer.parseInt(age)));
		}

		getServletContext().getRequestDispatcher("/name.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
