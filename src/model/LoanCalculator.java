package model;

public class LoanCalculator {
	double loanAmount;
	int months;
	double interest;
	double totalLoanAmount;
	double monthlyPayment;
	
	public LoanCalculator() {
		super();
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public double getTotalLoanAmount() {
		return totalLoanAmount;
	}

	public void setTotalLoanAmount(double totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}
	
	public LoanCalculator(double loanAmount, int months, double interest) {
		this.loanAmount = (double) Math.round(loanAmount * 100) / 100;
		this.months = months;
		this.interest = interest;
		CalculateLoan();
	}
	
	public LoanCalculator(int months, double interest, double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
		this.months = months;
		this.interest = interest;
		CalculateLoanAmount();
	}
	
	private void CalculateLoan() {
		double yearlyRate = interest / 100.0;
		double monthlyInterest = yearlyRate / 12.0;
		double monthlyPayment = (loanAmount * monthlyInterest) / (1 - Math.pow(1+monthlyInterest, -months));
		setMonthlyPayment(monthlyPayment);
		double totalPaid = monthlyPayment * months;
		double total = (double) Math.round(totalPaid * 100) / 100;

		setTotalLoanAmount(total);
	}
	
	private void CalculateLoanAmount() {
		double yearlyRate = interest / 100.0;
		double monthlyInterest = (yearlyRate / 12.0) + 1;
		double loanSub = Math.pow(monthlyInterest, -months);
		double oneLessLoanSub = 1 - loanSub;
		double principalAmt = monthlyPayment / (yearlyRate / 12.0);
		double loanAmount = principalAmt * oneLessLoanSub;
		double roundedLoanAmount = (double) Math.round(loanAmount * 100) / 100;
		setLoanAmount(roundedLoanAmount);
		setTotalLoanAmount(monthlyPayment * months);
	}

}
