package q10707;

import java.util.Scanner;

public class Q10707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, p, x, y;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		p = sc.nextInt();
		sc.close();

		x = a * p;
		y = b + (d * ((p - c > 0) ? p - c : 0));

		System.out.println((x < y) ? x : y);
	}
}
