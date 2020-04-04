package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employee = new ArrayList<>();
		int numberEmployee = 0;
		double percentage;

		System.out.print("How many employee will be registered? ");
		numberEmployee = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < numberEmployee; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			employee.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();

		Employee result = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (result == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			percentage = sc.nextDouble();
			sc.nextLine();
			result.increaseSalary(percentage);
		}

		System.out.println("\n------------------------\nList of Employees:\n------------------------");
		
		for (Employee list : employee) {
			System.out.print(list);
		}

		sc.close();
	}

}
