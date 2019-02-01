package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 * Servlet implementation class getDetailsServlet
 */
@WebServlet("/getDetailsServlet")
public class getDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
		int months = Integer.parseInt(request.getParameter("loanDuration"));
		double interest = Double.parseDouble(request.getParameter("loanPercent"));
		
		LoanCalculator userLoan = new LoanCalculator(loanAmount, months, interest);
		
		request.setAttribute("loanDetails", userLoan);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
