package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = sdf1.parse("26/03/2020 15:33:01"); //Mesmo que coloque valor no horário, o data é excluído.
		Date x2 = sdf2.parse("26/03/2020 15:33:01");
		Date x3 = new Date(System.currentTimeMillis()); //Retorna o instante atual em Milisegundos.
		Date x4 = new Date(1585247581000L); //Retorna a passagem em Milisegundos.
		Date x5 = new Date(1000L * 60L * 60L * 5L); //1 segundo e 1000 Milisegundos. UTC + 5 horas pelo horário de GMT
		
		
		//ISO 8601 format is the same yyyy-MM-ddTHH:mm:ssZ example: 2020-03-26T16:36:25Z
		Date y1 = Date.from(Instant.parse("2020-03-26T16:36:25Z")); // Este valor é diferente da saida. Considera GMT
		
		// Long x2 = 1585247581000L;
		// System.out.println(x1.getTime());
		
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(x3));
		System.out.println(sdf2.format(x4));
		System.out.println(sdf2.format(x5));
		System.out.println(sdf2.format(y1) + " <--- Data não atualizada com -03:00 horas");
		System.out.println("---------------------------");
		System.out.println(sdf3.format(y1) + " <--- Data atualizada com GMT");
		System.out.println("---------------------------");
		System.out.println(x1 + " <-- Datas sem formatação");
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
	}


}
