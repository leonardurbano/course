package application;

import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		People[] people = new People[10];
		int numberRenter, room;
		String name, email;
		System.out.print("How many rooms will be rented? ");
		numberRenter = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberRenter; i++) {
			System.out.printf("Renter: #%d%n", (i + 1));
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt() - 1;
			sc.nextLine();
			people[room] = new People(name, email);
		}

		System.out.println("############# BUSY ROOMS #############");

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				System.out.println((i + 1) + ": " + people[i]);
			}
		}
		
		System.out.println("######################################");

		sc.close();
	}
}
