package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data:");
		System.out.print("Product name: ");
		String name = sc.nextLine();
		System.out.print("Product price: ");
		double price = sc.nextDouble();

		Product p = new Product(name, price);

		System.out.println("\nPRODUCT ENTERED\n" + p);

		System.out.println();
		System.out.print("Enter quantity product in the stock: ");
		p.addProducts(sc.nextInt());
		System.out.println("\nPRODUCT UPDATE:\n" + p);

		System.out.println();
		System.out.print("Removed quantity product from stock: ");
		p.removeProducts(sc.nextInt());
		System.out.println("\nPRODUCT UPDATE:\n" + p);

		sc.close();
	}

}
