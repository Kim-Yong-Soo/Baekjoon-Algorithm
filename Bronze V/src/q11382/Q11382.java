package q11382;

import java.util.*;
import java.math.*;

public class Q11382 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b, c;

		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		c = sc.nextBigInteger();
		sc.close();

		System.out.println(a.add(b).add(c));
	}
}