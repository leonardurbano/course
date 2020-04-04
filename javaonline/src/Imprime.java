/***
 * 
 * @author Leonardo Urbano de Sousa Date: 22/01/2020 Description: Classe que
 *         testa a impressão.
 *
 */
public class Imprime {
	/*
	 * Type primitives: byte, short, int, long, double, float, char e boolean Type
	 * reference: String
	 */
	public static void main(String[] args) {
		String nome = "Leonardo Urbano de Sousa";
		String areaFuncao = "Técnico de Áudio";
		int idade = 37;
		boolean ativo = true;

		System.out.printf("Nome: %s\nFuncao: %s\nIdade: %s\nAtivo: %b", nome, areaFuncao, idade, ativo);

	}
}
