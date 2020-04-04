
/***
 * 
 * @author Leonardo Urbano de Sousa
 * @Descricao: trabalhando com String
 *
 */
public class ProgramString {

	public static void main(String[] args) {

		String msn = "Onda de inc�ndios QUE come�ou em SETEMBRO de 2019 matou 23 PESSOAS e milh�es de animais.";
		
		//Maiusculas: toUpperCase();
		//Minusculas: toLowerCase();
		//Remover Espa�os finais: trim();
		//Mostrar qtd caracter definido: substring(in�cio, final);
		//Substituir caracter: replace('�','a')
		//Localizar a posi��o inicial de um Char ou String: indexOf('i');
		//Localizar a posi��o final   de um Char ou String: lastIndexOf('i');
		

		String[] texto = msn.split(" ");
		String resumo = "";

		for (int i = 0; i < 5; i++) {

			resumo += texto[i].replace('�', 'e').replace('�', 'c') + " ";

		}

		System.out.println("Texto: " + msn);
		System.out.println("Resumo: " + resumo.trim().toUpperCase() + "...");

	}
}
