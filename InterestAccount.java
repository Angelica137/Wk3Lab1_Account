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
		double monthlyInt = getBalance() * getInterest();
		System.out.println(monthlyInt);
	}

	// getters and setters
	public double getInterest() {
		return monthlyInterestRate;
	}

	public void setInterest(double newInterestRate) {
		monthlyInterestRate = newInterestRate;
	}

	// return the claues of all the instance variables
	// of this account.

}