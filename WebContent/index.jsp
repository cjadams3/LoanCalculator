<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Calculator</title>
</head>
<body>
<form action="getDetailsServlet" method="post">
	<h2>Loan Calculator</h2><br />
	<p>Enter the amount that you would like to loan</p>
	<input type="text" name="loanAmount" size="10" /><br />
	<p>How many months will it take to pay the loan?</p>
	<input type="text" name="loanDuration" size="3" /><br />
	<p>What is the interest rate for the loan?</p>
	<input type="text" name="loanPercent" size="4" /><br /><br />
	<input type="reset" value="Reset" /><br /><br />
	<input type="submit" value="Calculate" />
</form>
</body>
</html>