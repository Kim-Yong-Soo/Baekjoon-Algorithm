package q2420;

import java.util.*;
import java.math.*;

public class Q2420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n, m;

		n = sc.nextBigInteger();
		m = sc.nextBigInteger();
		sc.close();

		System.out.println(n.subtract(m).abs());
	}
}