// Extends Account superclass

public class InterestAccount extends Account {

	// instance variable interestRate -> double
	private double monthlyInterestRate;

	// constructor with balance and monthly i
	public InterestAccount(double balance, double monthlyInterestRate) {
		super(balance); // call super class constructor
		this.monthlyInterestRate = monthlyInterestRate; // set intrest rate.

	}

	// .addMonthlyInterest() calculates interest due
	// for the month and adds it to the balance
	// interest is calculated on current balance
	public void addMonthlyInterest() {
		credit(getBalance() * getInterest());
	}

	// getters and setters
	public double getInterest() {
		return monthlyInterestRate;
	}

	public void setInterest(double newInterestRate) {
		monthlyInterestRate = newInterestRate;
	}

	// return the values of all the instance variables
	// of this account.
	public String toString() {
		return super.toString() + "; Interest rate: " + monthlyInterestRate;
	}

}