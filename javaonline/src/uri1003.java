import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor inteiro para \"A\": ");
		int a = sc.nextInt();
		System.out.print("Digite um valor inteiro para \"B\": ");
		int b = sc.nextInt();
		System.out.println("A Soma de A e B: " + (a + b));
		sc.close();
	}
}
