package q15726;

import java.util.Scanner;

public class Q15726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		int re1, re2;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		re1 = (int) (a * b / c);
		re2 = (int) (a / b * c);

		System.out.println((re1 < re2) ? re2 : re1);
	}
}