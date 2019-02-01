<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Results</title>
</head>
<body>
<p>For the following loan information:</p><br />
<p>Loan Amount:</p>
$ ${loanDetails.getLoanAmount()}<br />
<p>Number of Months: </p>
${loanDetails.getMonths()}<br />
<p>Interest Rate: </p>
${loanDetails.getInterest()}<br /><br />
<p><strong>You will pay:</strong></p>
<strong>
$ ${loanDetails.getTotalLoanAmount()}
</strong><br />
<a href="index.jsp">Enter another loan</a>
</body>
</html>