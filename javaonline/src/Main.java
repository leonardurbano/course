import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Removendo o m�todo "Locale" resultar� na formata��o do idioma padr�o do PC
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Product:%n");
		System.out.printf("%s which price is $%.2f%n", product1, price1);
		System.out.printf("%s which price is $%.2f%n", product2, price2);
		System.out.printf("%n");
		System.out.printf("Record: %d old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("%n");
		System.out.printf("Measue with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places):%.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}
}