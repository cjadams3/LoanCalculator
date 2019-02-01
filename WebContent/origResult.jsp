<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Original Loan Amount Calculator</title>
</head>
<body>
<p>For the following loan information:</p><br />
<p>Monthly Payment:</p>
$ ${loanDetails.getMonthlyPayment()}<br />
<p>Number of Months: </p>
${loanDetails.getMonths()}<br />
<p>Interest Rate: </p>
${loanDetails.getInterest()}<br /><br />
<p><strong>You will need to request a loan amount of:</strong></p>
<strong>
$ ${loanDetails.getLoanAmount()}
</strong><br />
<a href="calcLoanAmt.jsp">Calculate another loan</a>
</body>
</html>