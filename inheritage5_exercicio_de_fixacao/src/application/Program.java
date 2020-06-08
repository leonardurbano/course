package application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if (ch == 'u') {

				Calendar cal = Calendar.getInstance();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String dateString = sc.nextLine();

				int day = Integer.parseInt(dateString.substring(0, 2));
				int month = Integer.parseInt(dateString.substring(3, 5));
				int year = Integer.parseInt(dateString.substring(6));

				cal.set(year, month - 1, day);

				Date manufactureDate = cal.getTime();

				list.add(new UsedProduct(name, price, manufactureDate));

			} else {
				list.add(new Product(name, price));
			}
		}
		System.out.println();

		System.out.println("PRICE TAGS:");

		for (Product product : list) {
			System.out.println(product.priceTag());
		}

		sc.close();
	}
}
