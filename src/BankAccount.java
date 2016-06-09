
public class BankAccount {

	private String accountNumber = "";
	private double balance = 0.00;
	private double withdrawlFee = 0;
	private double annualInterestRate;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdrawalFee() {
		return withdrawlFee;
	}

	public void setWithdrawalFee(double withdrawalFee) {
		this.withdrawlFee = withdrawalFee;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public BankAccount(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public BankAccount(String accountNumber, double balance, double withdrawalFee, double annualInterestRate) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.withdrawlFee = withdrawalFee;
		this.annualInterestRate = annualInterestRate;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - (amount + withdrawlFee);
	}

	public boolean isOverDrawn() {
		if (balance >= 0) {
			return false;
		} else {
			return true;
		}
	}

	public String toString() {
		String message = ("BankAccount ") + (accountNumber + ":");
		if (balance >= 0) {
			return (message + " $" + String.format("%.2f", (Math.abs(balance))));
		} else {
			return (message + " ($" + String.format("%.2f", (Math.abs(balance))) + ")");
		}
	}
}