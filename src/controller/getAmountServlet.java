package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;

/**
 * Servlet implementation class getAmountServlet
 */
@WebServlet("/getAmountServlet")
public class getAmountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAmountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double monthlyPayment = Double.parseDouble(request.getParameter("monthlyPayment"));
		int months = Integer.parseInt(request.getParameter("loanDuration"));
		double interest = Double.parseDouble(request.getParameter("loanPercent"));
		
		LoanCalculator userLoan = new LoanCalculator(months, interest, monthlyPayment);
		
		request.setAttribute("loanDetails", userLoan);
		getServletContext().getRequestDispatcher("/origResult.jsp").forward(request, response);
	}

}
