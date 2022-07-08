
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/OtherServlet", "/other" })
public class OtherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OtherServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getAttribute("error") == null) {
			String firstName = (String) request.getAttribute("firstname");
			String lastName = (String) request.getAttribute("lastname");
			String age = (String) request.getAttribute("age");

			System.out.println(firstName + " " + lastName + "... Age: " + age);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
