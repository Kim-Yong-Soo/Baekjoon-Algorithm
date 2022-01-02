package q3004;

import java.util.Scanner;

public class Q3004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		sc.close();

		System.out.println((n / 2 + 1) * (n - (n / 2 + 1) + 2));
	}
}