package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter client date:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(new Date(System.currentTimeMillis()), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int itemsOrder = sc.nextInt();
		
		
		for(int i = 1; i<=itemsOrder; i++) {
			System.out.println("Enter #"+i+" item data:");
			System.out.print("Product name: ");
			String nameProduct = sc.next();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			Product product = new Product(nameProduct, price);
			OrderItem orderItens = new OrderItem(quantity, price, product);
			order.addItem(orderItens);
		}
		
		System.out.println(order);
		
		sc.close();
	}
}
