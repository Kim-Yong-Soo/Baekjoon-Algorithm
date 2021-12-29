package q2480;

import java.util.*;

public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		boolean ab = (a == b), bc = (b == c), ac = (a == c);

		if (ab && bc && ac) {
			System.out.println(10000 + a * 1000);
		} else if (ab || bc || ac) {
			System.out.println(1000 + 100 * (ab ? a : bc ? b : c));
		} else {
			int max = a;
			if (max < b)
				max = b;
			if (max < c)
				max = c;
			System.out.println(max*100);
		}
		System.out.println();
	}
}