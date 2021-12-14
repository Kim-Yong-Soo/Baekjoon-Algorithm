package q10699;

import java.time.LocalDate;

public class Q10699 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.getYear() + "-" + date.getMonthValue() + "-" + date.getDayOfMonth());
	}
}