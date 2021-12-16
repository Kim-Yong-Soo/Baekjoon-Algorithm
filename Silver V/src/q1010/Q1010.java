package q1010;

import java.util.*;
import java.math.*;

public class Q1010 {
	public BigInteger fact(int a) {
		BigInteger res = BigInteger.valueOf(a);
		if (a == 0)
			return BigInteger.valueOf(1);

		for (int i = a - 1; i > 0; i--)
			res = res.multiply(BigInteger.valueOf(i));
		return res;
	}

	public static void main(String[] args) {
		Q1010 ma = new Q1010();
		Scanner sc = new Scanner(System.in);
		int num, n, m;
		BigInteger[] res;

		num = sc.nextInt();
		res = new BigInteger[num];
		for (int i = 0; i < num; i++) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n < m) {
				int tem = n;
				n = m;
				m = tem;
			}
			res[i] = ma.fact(n).divide(ma.fact(m)).divide(ma.fact(n - m));
		}
		sc.close();

		for (BigInteger a : res)
			System.out.println(a);
	}
}