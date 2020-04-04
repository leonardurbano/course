package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDolar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price: ");
		double dollar = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		double amount = sc.nextDouble();

		System.out.println();

		System.out.printf("Dolar value: $ %.2f%n", dollar);
		System.out.printf("Dolar Amount: $ %.2f%n", amount);
		System.out.printf("Amount to be paid in reais: R$ %.2f%n", CurrencyConverter.converteDollarReal(amount, dollar));

		sc.close();
	}

}
