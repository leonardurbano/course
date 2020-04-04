import java.util.Scanner;

public class OperadoraTelefonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos usada neste m�s: ");
		int quantidadeMinutos = sc.nextInt();
		double plano = 50.0;
		
		if(quantidadeMinutos > 100) {
			plano += (quantidadeMinutos - 100)*2.0;
		}
		System.out.printf("Custo deste m�s: R$ %.2f%n", plano);
		
		sc.close();
		
	}
}
