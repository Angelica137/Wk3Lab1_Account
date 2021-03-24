// Extends Account superclass

public class InterestAccount extends Account {

	// instance variable interestRate -> double
	private double interestRate;

	// constructor with balance and monthly i
	public InterestAccount(double balance, double interestRate) {
		super(balance); // call super class constructor
		interestRate = 0; // set intrest rate.

	}

	// .addMonthlyInteres() calcualtes interest due
	// for the month and adds it to the blaance
	// interest is calculated on current balance

	// getter and setter methods for monhtlyInterestRate

	// return the claues of all the instance variables
	// of this account.

}