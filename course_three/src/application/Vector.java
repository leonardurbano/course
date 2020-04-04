package application;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		System.out.print("Enter number people: ");

		int number = sc.nextInt();
		double[] vect = new double[number];
		sc.nextLine();

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter height for %dª people: ", (i + 1));
			vect[i] = sc.nextDouble();
		}

		for (double n : vect) {
			sum += n;
		}

		System.out.printf("Average Height: %.2f Mts%n", (sum / vect.length));

		sc.close();
	}

}
