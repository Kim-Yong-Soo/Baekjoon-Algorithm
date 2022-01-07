package q5532;

import java.util.Scanner;

public class Q5532 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l, a, b, c, d, std_a, std_b;

		l = sc.nextInt();
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();

		std_a = (a % c == 0) ? a / c : a / c + 1;
		std_b = (b % d == 0) ? b / d : b / d + 1;
		System.out.println(l - ((std_a > std_b) ? std_a : std_b));
	}
}