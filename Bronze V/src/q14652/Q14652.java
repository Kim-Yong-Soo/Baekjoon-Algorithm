package q14652;

import java.util.*;

public class Q14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, k;

		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		sc.close();

		System.out.println(k / m + " " + k % m);
	}
}