package q2338;

import java.math.BigInteger;
import java.util.*;

public class Q2338 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b;

		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		sc.close();

		BigInteger plus = a.add(b), minus = a.subtract(b), mul = a.multiply(b);
		System.out.printf("%d\n%d\n%d", plus, minus, mul);
	}
}
