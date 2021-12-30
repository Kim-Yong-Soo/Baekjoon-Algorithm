package q2525;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, m, u;

		h = sc.nextInt();
		m = sc.nextInt();
		u = sc.nextInt();
		sc.close();

		h = h + (m + u) / 60;
		m = (m + u) % 60;

		if (h >= 24)
			h -= 24;

		System.out.println(h + " " + m);
	}
}