package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ContinueData {

	public static void main(String[] args) {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		
		Date x1 = Date.from(Instant.parse("2020-03-26T16:58:02Z")); // ISO 8601
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(sdf1.format(x1));

		cal.setTime(x1);
		cal.add(Calendar.HOUR, 3);
		x1 = cal.getTime();
		System.out.println(sdf1.format(x1));
		System.out.println("Current time: "+x2); //No formatting

		System.out.println("Year: " + cal.get(Calendar.YEAR));
		System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
		System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));

	}

}
