
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/calculate" })
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculateServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String principalAmount = request.getParameter("principalAmount");
		String interestRate = request.getParameter("interestRate");
		String years = request.getParameter("years");
		String timesPerYear = request.getParameter("timesPerYear");

		String error;
		double result;
		if (principalAmount.isBlank() || interestRate.isBlank() || years.isBlank() || timesPerYear.isBlank()) {
			error = "Some fields are empty";
			request.setAttribute("error", error);
		} else {
			result = Calculate.calculateCompoundInterest(Double.parseDouble(principalAmount),
					(Double.parseDouble(interestRate)/100), Integer.parseInt(years), Integer.parseInt(timesPerYear));
			request.setAttribute("result", result);
		}
		
		request.setAttribute("principal", principalAmount);
		request.setAttribute("interest", interestRate);
		request.setAttribute("years", years);
		request.setAttribute("compoundingRate", timesPerYear);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
