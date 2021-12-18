package q15964;

import java.math.*;
import java.util.*;

public class Q15964 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a, b;

		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		sc.close();

		System.out.println(a.add(b).multiply(a.subtract(b)));
	}
}