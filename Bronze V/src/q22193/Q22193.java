package q22193;

import java.math.BigInteger;
import java.util.*;

public class Q22193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		BigInteger a, b;

		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		sc.close();

		System.out.println(a.multiply(b));
	}
}