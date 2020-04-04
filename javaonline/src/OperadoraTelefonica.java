import java.util.Scanner;

public class OperadoraTelefonica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de minutos usada neste mês: ");
		int quantidadeMinutos = sc.nextInt();
		double plano = 50.0;
		
		if(quantidadeMinutos > 100) {
			plano += (quantidadeMinutos - 100)*2.0;
		}
		System.out.printf("Custo deste mês: R$ %.2f%n", plano);
		
		sc.close();
		
	}
}
