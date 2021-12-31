package q2530;

import java.util.Scanner;

public class Q2530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m, s, u;

		h = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		u = sc.nextInt();
		sc.close();

		m = m + (s + u) / 60;
		s = (s + u) % 60;

		if (m >= 60) {
			h = (h + m / 60) % 24;
			m %= 60;
		}

		System.out.println(h + " " + m + " " + s);
	}
}