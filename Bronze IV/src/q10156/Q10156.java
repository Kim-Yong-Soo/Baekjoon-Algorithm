package q10156;

import java.util.Scanner;

public class Q10156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k, n, m, res;

		k = sc.nextInt();
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();

		res = k * n - m;
		System.out.println((res > 0) ? res : 0);
	}
}