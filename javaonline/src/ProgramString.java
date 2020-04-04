
/***
 * 
 * @author Leonardo Urbano de Sousa
 * @Descricao: trabalhando com String
 *
 */
public class ProgramString {

	public static void main(String[] args) {

		String msn = "Onda de incêndios QUE começou em SETEMBRO de 2019 matou 23 PESSOAS e milhões de animais.";
		
		//Maiusculas: toUpperCase();
		//Minusculas: toLowerCase();
		//Remover Espaços finais: trim();
		//Mostrar qtd caracter definido: substring(início, final);
		//Substituir caracter: replace('ã','a')
		//Localizar a posição inicial de um Char ou String: indexOf('i');
		//Localizar a posição final   de um Char ou String: lastIndexOf('i');
		

		String[] texto = msn.split(" ");
		String resumo = "";

		for (int i = 0; i < 5; i++) {

			resumo += texto[i].replace('ê', 'e').replace('ç', 'c') + " ";

		}

		System.out.println("Texto: " + msn);
		System.out.println("Resumo: " + resumo.trim().toUpperCase() + "...");

	}
}
