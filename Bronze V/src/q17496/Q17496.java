package q17496;

import java.util.*;

public class Q17496 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, c, p, sum;

		n = sc.nextInt();
		t = sc.nextInt();
		c = sc.nextInt();
		p = sc.nextInt();
		sc.close();

		sum = 0;
		for (int i = 1; i <= n; i += t)
			sum += (i != 1) ? c : 0;

		System.out.println(sum * p);
	}
}