package q16170;

import java.time.*;

public class Q16170 {
	public static void main(String[] args) {
		ZoneOffset zoneOff = ZoneOffset.of("+00:00");
		ZonedDateTime date = ZonedDateTime.now(zoneOff);

		System.out.println(date.getYear() + "\n" + date.getMonthValue() + "\n" + date.getDayOfMonth());
	}
}