package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().toLowerCase().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialBalance = sc.nextDouble();
			account = new Account(number, holder, initialBalance);
		} else {
			account = new Account(number, holder);
		}

		System.out.println(account.toString());

		System.out.print("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println(account.toString());

		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.println(account.toString());

		sc.close();

	}
}
