
public class Fluxo {

	public static void main(String[] args) {
		int idade = 0;
		String status;

		if (idade < 18 && idade >= 0) {
			status = "uma CRIANÇA";
		} else if (idade >= 18 && idade <= 59) {
			status = "um ADULTO";
		} else {
			status = "um IDOSO";
		}

		System.out.printf("ANÁLISE DE IDADE:\nDada a idade de %s, o paciente é %s.\n",
				idade + (idade >= 0 && idade <= 1 ? " ano" : " anos"), status);
	}
}
