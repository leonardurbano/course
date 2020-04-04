import java.util.Scanner;

public class EstruturaRepeticao {

	public static void main(String[] args) {
		int numero,soma = 0;

		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite somente numeros inteiros:%n");
		while((numero = sc.nextInt()) != 0) {
			soma += numero;
		}
		System.out.printf("A soma dos números digitados: %d",soma);
		sc.close();
	}
}
