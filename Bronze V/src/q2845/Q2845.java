package q2845;

import java.util.*;

public class Q2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, mul;
		int[] article = new int[5];

		a = sc.nextInt();
		b = sc.nextInt();
		for (int i = 0; i < article.length; i++)
			article[i] = sc.nextInt();
		sc.close();

		mul = a * b;
		for (int art : article)
			System.out.print((art - mul) + " ");
	}
}
