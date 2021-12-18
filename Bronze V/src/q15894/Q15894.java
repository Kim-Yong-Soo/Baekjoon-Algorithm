package q15894;

import java.util.*;
import java.math.*;

public class Q15894 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n;

		n = sc.nextBigInteger();
		sc.close();

		System.out.println(n.multiply(BigInteger.valueOf(4)));
	}
}