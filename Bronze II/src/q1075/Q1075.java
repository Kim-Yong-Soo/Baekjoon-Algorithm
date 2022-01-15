package q1075;

import java.util.Scanner;

public class Q1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, f;

		n = sc.nextInt();
		f = sc.nextInt();
		sc.close();
		n = (n / 100) * 100;

		while (n % f != 0)
			n++;
		System.out.println(String.format("%02d", n % 100));
	}
}