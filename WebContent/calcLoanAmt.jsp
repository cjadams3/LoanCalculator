<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Loan Amount</title>
</head>
<body>
<form action="getAmountServlet" method="post">
	<h2>Loan Amount Calculator</h2>
	<p>Enter your desired monthly payment</p>
	<input type="text" name="monthlyPayment" size="10" /><br />
	<p>How many months would you like to pay this amount?</p>
	<input type="text" name="loanDuration" size="3" /><br />
	<p>What is the interest rate for the loan?</p>
	<input type="text" name="loanPercent" size="4" /><br /><br />
	<input type="reset" value="Reset" /><br /><br />
	<input type="submit" value="Calculate" />
</form>
</body>
</html>