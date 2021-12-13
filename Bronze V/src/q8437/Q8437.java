package q8437;

import java.math.BigInteger;
import java.util.*;

public class Q8437 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger all, klaudia, natalia;

		all = sc.nextBigInteger();
		klaudia = sc.nextBigInteger();
		sc.close();

		natalia = all.subtract(klaudia).divide(BigInteger.valueOf(2));
		klaudia = klaudia.add(natalia);

		System.out.println(klaudia + "\n" + natalia);
	}
}