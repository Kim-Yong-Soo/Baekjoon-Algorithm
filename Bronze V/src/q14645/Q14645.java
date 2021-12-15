package q14645;

import java.util.*;

public class Q14645 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;

		n = sc.nextInt();
		k = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			k += a;
			k -= b;
		}
		sc.close();

		System.out.println("비와이");
	}
}