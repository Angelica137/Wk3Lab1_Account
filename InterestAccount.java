// Extends Account superclass

public class InterestAccount extends Account {

	// instance variable interestRate -> double
	private double interestRate;

	// constructor with balance and monthly i
	public InterestAccount(double balance, double interestRate) {
		super(balance); // call super class constructor
		this.interestRate = interestRate; // set intrest rate.

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
		return interestRate;
	}

	public void setInterest(double newInterestRate) {
		interestRate = newInterestRate;
	}

	// return the claues of all the instance variables
	// of this account.

}