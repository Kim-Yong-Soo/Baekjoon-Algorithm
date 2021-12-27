package q1712;

import java.util.*;

public class Q1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		System.out.println((c - b <= 0) ? -1 : (a / (c - b)) + 1);
	}
}