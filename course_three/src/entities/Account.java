package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private double tax = 5.00;

	public Account(int number, String holder) {
		this.number = number;
		this.setHolder(holder);
	}

	public Account(int number, String holder, double initialBalance) {
		this.number = number;
		this.setHolder(holder);
		this.deposit(initialBalance);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder.toUpperCase();
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		System.out.println("\nUpdated account data:");
		this.balance += amount;
	}

	public void withdraw(double amount) {
		System.out.println("\nUpdated account data:");
		this.balance -= amount + tax;
	}

	public String toString() {
		return "Account: " + getNumber() + ", Holder: " + getHolder() + ", Balance: "
				+ String.format("$ %.2f ", getBalance());
	}
}
