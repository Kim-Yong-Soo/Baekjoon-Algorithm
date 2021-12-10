package q1271;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger balance, num;
		balance = sc.nextBigInteger();
		num = sc.nextBigInteger();
		sc.close();
		System.out.println(balance.divide(num) + "\n" + balance.remainder(num));
	}
}
