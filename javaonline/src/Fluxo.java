
public class Fluxo {

	public static void main(String[] args) {
		int idade = 0;
		String status;

		if (idade < 18 && idade >= 0) {
			status = "uma CRIAN�A";
		} else if (idade >= 18 && idade <= 59) {
			status = "um ADULTO";
		} else {
			status = "um IDOSO";
		}

		System.out.printf("AN�LISE DE IDADE:\nDada a idade de %s, o paciente � %s.\n",
				idade + (idade >= 0 && idade <= 1 ? " ano" : " anos"), status);
	}
}
