package q14928;

import java.util.*;

public class Q14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		int b;

		a = sc.next();
		sc.close();

		b = 0;
		for (int i = 0; i < a.length(); i++)
			b = (b * 10 + (a.charAt(i) - '0')) % 20000303;

		System.out.println(b);
	}
}