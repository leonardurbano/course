import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensagem = "";
		System.out.print("Digite o n�mero de (1-7) para identificar o dia da semana: ");
		int dia = sc.nextInt();
		switch(dia) {
			case 1: mensagem = "o Domingo";break;
			case 2: mensagem = "a Segunda-feira";break;
			case 3: mensagem = "a Ter�a-feira";break;
			case 4: mensagem = "a Quarta-feira";break;
			case 5: mensagem = "a Quinta-feira";break;
			case 6: mensagem = "a Sexta-feira";break;
			case 7: mensagem = "o S�bado";break;
			default: mensagem = "Inv�lido";
		}
		System.out.printf("O dia \"%d\" da semana � %s.%n",dia,mensagem);
		sc.close();
	}
}